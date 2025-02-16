package Reflection.Intermediate_Level.Access_and_Modify_Static_Fields;

import java.lang.reflect.Field;

public class ReflectionModifyStaticField {
    public static void main(String[] args) {
        try {
            Class<?> configClass = Configuration.class;

            Field apiKeyField = configClass.getDeclaredField("API_KEY");

            apiKeyField.setAccessible(true);

            apiKeyField.set(null, "NEW_SECRET_KEY");

            System.out.println("Modified API_KEY: " + Configuration.getApiKey());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
