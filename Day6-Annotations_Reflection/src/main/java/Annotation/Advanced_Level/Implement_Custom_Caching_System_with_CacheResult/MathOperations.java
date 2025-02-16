package Annotation.Advanced_Level.Implement_Custom_Caching_System_with_CacheResult;

public class MathOperations {
    @CacheResult // Marked for caching
    public int expensiveComputation(int num) {
        System.out.println("Performing expensive computation for: " + num);
        try {
            Thread.sleep(2000); // Simulate heavy computation
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return num * num; // Square of the number
    }
}
