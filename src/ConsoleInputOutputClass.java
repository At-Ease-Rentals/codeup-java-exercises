import java.util.Scanner;

public class ConsoleInputOutputClass {

    public static void main(String[] args) {
//        String name = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you. %n", name);

//        String greeting = "Salutations";
//        String name = "codeup";
//        System.out.printf("%s, %s!", greeting, name);

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter something: ");
    String userInput = scanner.next();

    System.out.println("You entered: -->\"" + userInput + "\" <--");

    }
}

