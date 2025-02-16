package Reflection.Advanced_Level.Create_Custom_Object_Mapper;

import java.util.HashMap;
import java.util.Map;

public class CustomObjectMapperDemo {
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Alice");
        data.put("age", 25);
        data.put("nonExistentField", "test");

        Person person = ObjectMapper.toObject(Person.class, data);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
