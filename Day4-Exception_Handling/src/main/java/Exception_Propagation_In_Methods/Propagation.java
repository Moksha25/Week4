package Exception_Propagation_In_Methods;

public class Propagation {
    public static void method1() {
        int x = 10 / 0; // This will cause ArithmeticException
    }

    public static void method2() {
        method1();
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
