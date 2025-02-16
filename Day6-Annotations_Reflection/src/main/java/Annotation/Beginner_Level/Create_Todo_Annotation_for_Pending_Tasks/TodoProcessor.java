package Annotation.Beginner_Level.Create_Todo_Annotation_for_Pending_Tasks;

import java.lang.reflect.Method;

public class TodoProcessor
{
    public static void main(String[] args) {
        Class<ProjectManager> obj = ProjectManager.class;

        System.out.println("Pending Tasks:");

        for (Method method : obj.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName());
                System.out.println(" - Task: " + annotation.task());
                System.out.println(" - Assigned To: " + annotation.assignedTo());
                System.out.println(" - Priority: " + annotation.priority());
                System.out.println();
            }
        }
    }
}
