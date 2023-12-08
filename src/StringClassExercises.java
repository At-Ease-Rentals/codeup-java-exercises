import java.util.Scanner;

public class StringClassExercises {

    public static void main(String[] args){
        String message = "Hello";
        System.out.println(message);
        message = message +" World";
       System.out.println(message);

       Scanner sc =new Scanner(System.in);
       System.out.println("Continue? [y/n]");
       String userInput = sc.next();

        if ("I am a string".equals("I am a string")) {
            System.out.println("Strings are equal");

//         String comparison methods
            String input = "Codeup Rocks!";
            System.out.println( input.equals("codeup rocks!"));
            System.out.println(input.equals("Codeup Rocks!"));

            System.out.println(input.equalsIgnoreCase("code rocks!"));
            System.out.println(input.equalsIgnoreCase("Codeup Rocks!"));

            System.out.println(input.startsWith("codeup"));
            System.out.println(input.startsWith("Codeup"));

            System.out.println(input.endsWith("rocks"));
            System.out.println(input.endsWith("rocks!"));
            System.out.println(input.endsWith("Rocks!"));

//            string manipulation methods

        }
    }
}
