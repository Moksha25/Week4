package Annotation.Exercise.Create_and_Use_Repeatable_Annotation;

public class BugTracker
{
    @BugReport(description = "Null pointer exception when input is null", reportedBy = "Alice", date = "2024-02-13")
    @BugReport(description = "Incorrect calculation when input is negative", reportedBy = "Bob", date = "2024-02-12")
    public void buggyMethod() {
        System.out.println("Executing a buggy method...");
    }
}
