// Interface 1
interface Animal {
    void eat();   // abstract method
}

// Interface 2
interface Pet {
    void play();  // abstract method
}

// Class implementing both interfaces
class Dog implements Animal, Pet {
    // Must provide implementations for both interfaces
    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void play() {
        System.out.println("Dog is playing.");
    }

    // Extra method of Dog
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Main class
public class problem2 {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Methods from both interfaces
        d.eat();   // from Animal
        d.play();  // from Pet

        // Dog’s own method
        d.bark();
    }
}