package Reflection.Advanced_Level.Generate_JSON_Representation;

import java.lang.reflect.Field;

public class JsonConverter {
    public static String toJson(Object obj) {
        if (obj == null) return "null";

        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder("{");

        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                String fieldName = fields[i].getName();
                Object fieldValue = fields[i].get(obj);

                json.append("\"").append(fieldName).append("\": ");

                if (fieldValue instanceof String) {
                    json.append("\"").append(fieldValue).append("\"");
                } else {
                    json.append(fieldValue);
                }

                if (i < fields.length - 1) {
                    json.append(", ");
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Error accessing field: " + fields[i].getName(), e);
            }
        }

        json.append("}");
        return json.toString();
    }
}
