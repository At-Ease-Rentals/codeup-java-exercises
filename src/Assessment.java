import java.util.ArrayList;

public class Assessment {
    public static int square(int num) {
        return num * num;
    }

    public static void testSquare() {
        int result = square(5);
        System.out.println("Test Square: Square of 5 is " + result);//25
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static void testSum() {
        int resultInt = sum(3, 4);
        double resultDouble = sum(2.5, 3.5);
        System.out.println("Test Sum: Sum of integers is " + resultInt);//7
        System.out.println("Test Sum: Sum of doubles is " + resultDouble);//6.0
    }

    public static double average(int[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void testAverage() {
        int[] numbers = {1, 2};
        double result = average(numbers);
        System.out.println("Test Average: Average of [1, 2] is " + result);//1.5
    }

    public static ArrayList<User> capitalizeRecords(ArrayList<User> users) {
        ArrayList<User> capitalizedUsers = new ArrayList<>();

        for (User user : users) {
            String capitalizedFirstName = user.getFirstName().substring(0, 1).toUpperCase() + user.getFirstName().substring(1);
            String capitalizedLastName = user.getLastName().substring(0, 1).toUpperCase() + user.getLastName().substring(1);
            User capitalizedUser = new User(capitalizedFirstName, capitalizedLastName, user.isAdmin());
            capitalizedUsers.add(capitalizedUser);
        }
        return capitalizedUsers;
    }
 }

