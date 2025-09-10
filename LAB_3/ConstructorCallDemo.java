// 5. Show When Constructors Are Called
class Parent {
    Parent() {
        System.out.println("Parent class constructor called.");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child class constructor called.");
    }
}

public class ConstructorCallDemo {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("Object created: " + c); 
    }
}
