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
}

