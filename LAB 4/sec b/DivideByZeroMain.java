// 1.a Divide-by-zero inside main()
class DivideByZeroMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result;

        try {
            result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e);
        }

        System.out.println("Program continues after exception handling...");
    }
}
