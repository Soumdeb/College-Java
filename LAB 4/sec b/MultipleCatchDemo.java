// 5. Multiple Catch Statements
class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[10] = 50 / 0; // Two exceptions possible
        } catch (ArithmeticException e) {
            System.out.println("Caught Arithmetic Exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Array Index Exception: " + e);
        } catch (Exception e) {
            System.out.println("Caught General Exception: " + e);
        }

        System.out.println("Program continues after multiple catch handling...");
    }
}
