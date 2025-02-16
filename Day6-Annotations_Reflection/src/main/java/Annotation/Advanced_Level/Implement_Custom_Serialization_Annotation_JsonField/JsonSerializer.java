package Annotation.Advanced_Level.Implement_Custom_Serialization_Annotation_JsonField;

import java.lang.reflect.Field;
import java.util.Map;
import java.util.HashMap;

public class JsonSerializer {
    public static String serialize(Object obj) {
        Map<String, String> jsonMap = new HashMap<>();

        Class<?> objClass = obj.getClass();
        for (Field field : objClass.getDeclaredFields()) {
            field.setAccessible(true); // Allow access to private fields

            if (field.isAnnotationPresent(JsonField.class)) {
                JsonField annotation = field.getAnnotation(JsonField.class);
                String key = annotation.name(); // Get the custom key name

                try {
                    Object value = field.get(obj); // Get field value
                    jsonMap.put(key, value.toString());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Convert the map to a JSON string format
        StringBuilder json = new StringBuilder("{");
        for (Map.Entry<String, String> entry : jsonMap.entrySet()) {
            json.append("\"").append(entry.getKey()).append("\": ")
                    .append("\"").append(entry.getValue()).append("\", ");
        }

        if (json.length() > 1) {
            json.setLength(json.length() - 2); // Remove trailing comma and space
        }
        json.append("}");

        return json.toString();
    }
}
