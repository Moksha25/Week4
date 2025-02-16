package Annotation.Advanced_Level.Implement_Custom_Caching_System_with_CacheResult;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheManager {
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invokeCachedMethod(Object obj, String methodName, Object... args) {
        try {
            // Generate a unique cache key based on method name and arguments
            String cacheKey = methodName + "_" + generateKey(args);

            // Return cached result if available
            if (cache.containsKey(cacheKey)) {
                System.out.println("Returning cached result for: " + cacheKey);
                return cache.get(cacheKey);
            }

            // Get the method reference
            Method method = obj.getClass().getMethod(methodName, toClassArray(args));

            // Check if the method is annotated with @CacheResult
            if (method.isAnnotationPresent(CacheResult.class)) {
                Object result = method.invoke(obj, args);
                cache.put(cacheKey, result); // Store result in cache
                return result;
            } else {
                // If not annotated, simply execute the method
                return method.invoke(obj, args);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String generateKey(Object... args) {
        StringBuilder keyBuilder = new StringBuilder();
        for (Object arg : args) {
            keyBuilder.append(arg.toString()).append("_");
        }
        return keyBuilder.toString();
    }

    private static Class<?>[] toClassArray(Object... args) {
        Class<?>[] classes = new Class<?>[args.length];
        for (int i = 0; i < args.length; i++) {
            classes[i] = args[i].getClass();
        }
        return classes;
    }
}
