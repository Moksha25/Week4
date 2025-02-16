package Reflection.Advanced_Level.Create_Custom_Object_Mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();

            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();

                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(obj, fieldValue);
                } catch (NoSuchFieldException e) {
                    System.out.println("Warning: No field named " + fieldName + " in class " + clazz.getSimpleName());
                }
            }
            return obj;

        } catch (Exception e) {
            throw new RuntimeException("Error mapping object", e);
        }
    }
}
