package Annotation.Intermediate_Level.Create_Annotation_for_Logging_Method_Execution_Time;

import java.lang.reflect.Method;

public class ExecutionTimeLogger
{
    public static void main(String[] args) throws Exception {
        PerformanceTest test = new PerformanceTest();
        Class<?> obj = test.getClass();

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(test); // Invoke the method
                long endTime = System.nanoTime();

                long executionTime = (endTime - startTime) / 1_000_000; // Convert to milliseconds
                System.out.println("Execution Time of " + method.getName() + ": " + executionTime + " ms\n");
            }
        }
    }
}
