// 10. User-Defined Exception
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

class CustomExceptionDemo {
    static void validateAge(int age) throws MyCustomException {
        if (age < 18) {
            throw new MyCustomException("Age " + age + " is not valid for voting!");
        } else {
            System.out.println("Age " + age + " is valid. You can vote.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (MyCustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }

        try {
            validateAge(25);
        } catch (MyCustomException e) {
            System.out.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
