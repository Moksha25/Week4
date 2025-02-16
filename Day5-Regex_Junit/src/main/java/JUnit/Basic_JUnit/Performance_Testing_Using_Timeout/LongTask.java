package JUnit.Basic_JUnit.Performance_Testing_Using_Timeout;

public class LongTask
{
    public static void longRunningTask() {
        try {
            Thread.sleep(3000); // Simulating a long task (3 seconds)
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
