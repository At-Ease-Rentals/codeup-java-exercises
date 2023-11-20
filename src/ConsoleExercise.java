import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ConsoleExercise {

    public static void main(String[] args){

//        Copy this code into your main method:
//
//double pi = 3.14159;
//Write some Java code that uses the variable pi to output the following:
//
// The value of pi is approximately 3.14.
//Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this
//
//        double  pi = 3.14159;
//        System.out.printf("The value of pi i %f%n", pi);


//Explore the Scanner Class
//1.Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
//What happens if you input something that is not an integer?

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a number:");
//        Integer userInput = Integer.valueOf(scanner.next());
//
//        System.out.printf("You entered: %d%n", userInput);

//2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//
//What happens if you enter less than 3 words? The program prompts the user to enter another word.
//What happens if you enter more than 3 words? The user could not enter more than three words. The program ends.

//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter a three letter word:");
//        String threeLetterWord = scanner1.next();
//        System.out.printf("You entered: %s%n", threeLetterWord)
//        ;
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Enter a four letter word:");
//        String fourLetterWord = scanner2.next();
//        System.out.printf("You entered: %s%n", fourLetterWord);
//
//        Scanner scanner3 = new Scanner(System.in);        System.out.println("Enter a five letter word:");
//        String fiveLetterWord = scanner3.next();
//        System.out.printf("You entered: %s%n", fiveLetterWord);

//3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then
// display that sentence back to the user. do you capture all the words? No, only the first work was captured

//        Scanner scanner4 = new Scanner(System.in);
//        System.out.print("Enter a short sentence:");
//        String userSentence = scanner4.next();
//        System.out.printf("You have entered: %s%n", userSentence);

//4.Rewrite the above example using the nextLine method.

//        String userSentence = scanner4.nextLine();
//        System.out.printf("You have entered: %s%n", userSentence);


//Calculate the perimeter and area of Codeup's classrooms.

//1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
//
//Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
//
//  Assume that the rooms are perfect rectangles.
//  Assume that the user will enter valid numeric data for   length and width.
//
// 2. Display the area and perimeter of that classroom.
//
//The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.

        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Let's calculate the area and the perimeter of the classroom.");
        System.out.print("Enter the length of the classroom: ");
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        System.out.printf("You entered: %f%n", length);

        System.out.print("Enter the width of the classroom: ");
         double width = Double.parseDouble(scanner.next());
        System.out.printf("You entered: %f%n", width);


        Double areaOfClassroom = (2*length) + (2*width);
        Double perimeterOfClassroom = length * width;
        System.out.printf("The classroom has an area of: %f and a perimeter of: %f%n",
               areaOfClassroom, perimeterOfClassroom);

    }
}
