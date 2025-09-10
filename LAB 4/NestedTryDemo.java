// 6. Nested Try Clauses
class NestedTryDemo {
    public static void main(String[] args) {
        try {
            int[] nums = {10, 20, 30};
            System.out.println("Outer try block...");

            try {
                int result = nums[1] / 0; 
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Caught Arithmetic Exception in inner try: " + e);
            }

            System.out.println(nums[5]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Array Index Exception in outer try: " + e);
        }

        System.out.println("Program continues after nested try handling...");
    }
}
