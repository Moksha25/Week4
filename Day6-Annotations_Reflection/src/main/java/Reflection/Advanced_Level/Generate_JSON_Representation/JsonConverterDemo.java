package Reflection.Advanced_Level.Generate_JSON_Representation;

public class JsonConverterDemo {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25, true);

        String jsonString = JsonConverter.toJson(person);

        System.out.println(jsonString);
    }
}
