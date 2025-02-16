package Reflection.Advanced_Level.Method_Execution_Timing;

class Sample {
    public void fastMethod() {
        System.out.println("Fast Method Executing...");
    }

    public void slowMethod() throws InterruptedException {
        Thread.sleep(1000); // Simulating a slow method
        System.out.println("Slow Method Executing...");
    }
}