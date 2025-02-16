package Reflection.Advanced_Level.Dependency_Injection_using_Reflection;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class DIContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();

    public DIContainer() {
        // Register classes in the container
        instances.put(Service.class, new ServiceImpl());
    }

    public <T> T getInstance(Class<T> clazz) throws Exception {
        T instance = clazz.getDeclaredConstructor().newInstance(); // Create instance

        // Inject dependencies
        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                Class<?> fieldType = field.getType();
                Object dependency = instances.get(fieldType);

                if (dependency == null) {
                    throw new RuntimeException("No registered instance for " + fieldType.getName());
                }

                field.setAccessible(true);
                field.set(instance, dependency);
            }
        }

        return instance;
    }
}