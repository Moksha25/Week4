package Annotation.Exercise.Create_Custom_Annotatio_and_Use_It;

public class TaskManager
{
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void completeCriticalTask() {
        System.out.println("Completing a critical task...");
    }

    @TaskInfo(priority = "Medium", assignedTo = "Bob")
    public void completeRegularTask() {
        System.out.println("Completing a regular task...");
    }
}
