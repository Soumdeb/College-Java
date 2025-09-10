// 8. WAP to pass an object reference variable to a method
class Box {
    int length, width;

    Box(int l, int w) {
        length = l;
        width = w;
    }

    void display() {
        System.out.println("Length = " + length + ", Width = " + width);
    }
}

public class PassObjectDemo {
    static void modify(Box b) {
        b.length += 5;
        b.width += 3;
        System.out.println("Inside method (modified): Length = " + b.length + ", Width = " + b.width);
    }

    public static void main(String[] args) {
        Box b1 = new Box(10, 20);
        System.out.println("Before method call:");
        b1.display();

        modify(b1); 

        System.out.println("After method call:");
        b1.display();
    }
}
