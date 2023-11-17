import java.sql.SQLOutput;

public class Assessment {


    //1. Write a public static method named square that accepts an integer as input and returns that number times itself.
    public static int square(int num) {
        return num * num;
    }

    public static void testSquare() {
        int result = square(5);
        System.out.println("Test Square: Square of 5 is " + result);
    }
    // Write a public static method named sum that accepts two arguments and that works with both integers and doubles (use method overloading) and returns the result of adding the two passed numbers.

    //Integer method
    public static int sum (int num1, int num2) {
        return num1 + num2;
    }

    //Double method
    public static double sum (double num1, double num2) {
        return num1 + num2;
    }
    public static void testSum() {
        int resultInt = sum(3, 4);
        double resultDouble = sum(2.5, 3.5);
        System.out.println("Test Sum: Sum of integers is " + resultInt);
        System.out.println("Test Sum: Sum of doubles is " + resultDouble);
    }
}

