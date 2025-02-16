package Annotation.Beginner_Level.Create_Annotation_to_Mark_Important_Methods;

public class TaskManager
{
    @ImportantMethod(level = "CRITICAL")
    public void processPayment() {
        System.out.println("Processing payment...");
    }

    @ImportantMethod
    public void generateReport() {
        System.out.println("Generating report...");
    }

    public void normalTask() {
        System.out.println("Performing a normal task...");
    }
}
