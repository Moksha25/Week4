package Reflection.Intermediate_Level.Retrieve_Annotations_at_Runtime;

public class AnnotationRetriever {
    public static void main(String[] args) {
        try {
            // Get class reference
            Class<?> clazz = SampleClass.class;

            // Check if @Author annotation is present
            if (clazz.isAnnotationPresent(Author.class)) {
                // Retrieve the annotation
                Author author = clazz.getAnnotation(Author.class);

                // Display annotation value
                System.out.println("Author: " + author.name());
            } else {
                System.out.println("No @Author annotation found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
