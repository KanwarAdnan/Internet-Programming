class MySpecialNumberException extends Exception {
    public MySpecialNumberException(String message) {
        super(message);
    }
}

class CustomExceptionExample {
    static void myfunc(int x) throws MySpecialNumberException {
        if (x == 10) {
            throw new MySpecialNumberException("Number 10 is not allowed.");
        } else if (x == 20) {
            throw new MySpecialNumberException("Number 20 is not allowed.");
        } else if (x == 30) {
            throw new MySpecialNumberException("Number 30 is not allowed.");
        } else {
            System.out.println("Value: " + x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            CustomExceptionExample.myfunc(15);
            CustomExceptionExample.myfunc(20);
            CustomExceptionExample.myfunc(25);
            CustomExceptionExample.myfunc(30);
        } catch (MySpecialNumberException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
