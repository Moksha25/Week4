package Reflection.Intermediate_Level.Access_and_Modify_Static_Fields;

public class Configuration {
    private static String API_KEY = "DEFAULT_KEY";

    // Method to get API_KEY
    public static String getApiKey() {
        return API_KEY;
    }
}
