package Annotation.Intermediate_Level.Create_MaxLength_Annotation_for_Field_Validation;

public class User
{
    @MaxLength(10) // Restrict username length to 10 characters
    private String username;

    public User(String username) {
        validateMaxLength(username);
        this.username = username;
    }

    private void validateMaxLength(String username) {
        try {
            int maxLength = this.getClass()
                    .getDeclaredField("username")
                    .getAnnotation(MaxLength.class)
                    .value();

            if (username.length() > maxLength) {
                throw new IllegalArgumentException("Username exceeds maximum length of " + maxLength + " characters.");
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}
