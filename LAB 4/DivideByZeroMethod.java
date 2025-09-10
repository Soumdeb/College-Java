// 1.b Divide-by-zero inside a method (not main)
class DivideByZeroMethod {
    static void compute() {
        int x = 50;
        int y = 0;
        System.out.println("Inside compute method...");
        int z = x / y; 
        System.out.println("Result: " + z); 
    }

    public static void main(String[] args) {
        try {
            compute();
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception in main: " + e);
        }
        System.out.println("Program continues after exception handling...");
    }
}
