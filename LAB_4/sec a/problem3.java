// Outer class
class Outer {
    // Nested interface
    public interface NestedInterface {
        void showMessage();
    }
}

// A class implements the nested interface
class InnerClass implements Outer.NestedInterface {
    public void showMessage() {
        System.out.println("Hello from Nested Interface implementation!");
    }
}

// Main class
public class problem3 {
    public static void main(String[] args) {
        // Create object of class implementing nested interface
        Outer.NestedInterface obj = new InnerClass();
        obj.showMessage();
    }
}