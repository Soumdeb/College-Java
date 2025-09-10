// Program 8: Demonstrate type promotion in expressions
class TypePromotionDemo {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        char c = 'A'; 
        int i = 100;
        long l = 1000L;
        float f = 3.5f;
        double d = 99.99;

        System.out.println("b + s = " + (b + s)); 
        System.out.println("s + c = " + (s + c)); 
        System.out.println("i + l = " + (i + l)); 
        System.out.println("l + f = " + (l + f)); 
        System.out.println("f + d = " + (f + d)); 
    }
}
