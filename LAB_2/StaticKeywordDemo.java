// 7. WAP to demonstrate the use of static keyword
class Counter {
    static int count = 0;

    Counter() {
        count++;
        System.out.println("Object created. Count = " + count);
    }

    static void showTotalObjects() {
        System.out.println("Total objects created = " + count);
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("c1 object: " + c1);
        System.out.println("c2 object: " + c2);
        System.out.println("c3 object: " + c3);

        Counter.showTotalObjects();
    }
}
