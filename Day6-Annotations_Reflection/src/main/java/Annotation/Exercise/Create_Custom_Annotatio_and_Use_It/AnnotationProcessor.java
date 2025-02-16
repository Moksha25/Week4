package Annotation.Exercise.Create_Custom_Annotatio_and_Use_It;

import java.lang.reflect.Method;

public class AnnotationProcessor
{
    public static void main(String[] args) {
        Class<TaskManager> obj = TaskManager.class;

        for (Method method : obj.getDeclaredMethods()) {

            if (method.isAnnotationPresent(TaskInfo.class)) {
                TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

                // Print annotation details
                System.out.println("Method: " + method.getName());
                System.out.println("Priority: " + taskInfo.priority());
                System.out.println("Assigned To: " + taskInfo.assignedTo());
                System.out.println("----------------------");
            }
        }
    }
}
