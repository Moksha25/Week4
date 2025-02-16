package Annotation.Beginner_Level.Create_Todo_Annotation_for_Pending_Tasks;

public class ProjectManager
{
    @Todo(task = "Implement login validation", assignedTo = "Alice", priority = "HIGH")
    public void validateLogin() {
        System.out.println("Validating user login...");
    }

    @Todo(task = "Optimize database queries", assignedTo = "Bob")
    public void optimizeDatabase() {
        System.out.println("Optimizing database queries...");
    }

    @Todo(task = "Improve UI responsiveness", assignedTo = "Charlie", priority = "LOW")
    public void enhanceUI() {
        System.out.println("Enhancing UI responsiveness...");
    }

    public void completedTask() {
        System.out.println("This task is completed.");
    }
}
