//9. WAP to demonstrate the use of this keyword
class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;   
        this.name = name;
    }

    void display() {
        System.out.println("Roll No: " + this.rollNo + ", Name: " + this.name);
    }

    void showCurrentObject() {
        System.out.println("Current object reference: " + this);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Rahul");
        Student s2 = new Student(102, "Priya");

        s1.display();
        s1.showCurrentObject();

        s2.display();
        s2.showCurrentObject();
    }
}
