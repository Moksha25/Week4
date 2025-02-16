package Annotation.Intermediate_Level.Create_Annotation_for_Logging_Method_Execution_Time;

public class PerformanceTest
{
    @LogExecutionTime
    public void fastMethod() {
        System.out.println("Executing fast method...");
    }

    @LogExecutionTime
    public void slowMethod() {
        System.out.println("Executing slow method...");
        try {
            Thread.sleep(2000); // Simulating a slow task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
