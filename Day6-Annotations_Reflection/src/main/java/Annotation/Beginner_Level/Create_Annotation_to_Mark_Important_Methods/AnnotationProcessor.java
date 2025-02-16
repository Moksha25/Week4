package Annotation.Beginner_Level.Create_Annotation_to_Mark_Important_Methods;

import java.lang.reflect.Method;

public class AnnotationProcessor
{
    public static void main(String[] args) {
        Class<TaskManager> obj = TaskManager.class;

        System.out.println("Important Methods:");

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Importance Level: " + annotation.level());
            }
        }
    }
}
