import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bob: Bro! What are you saying?");

        while (true) {
            String userInput = scanner.nextLine().trim();
            if (userInput.isEmpty()) {
                System.out.println("Bob: Fine. Be that way!"); // He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
            } else if (userInput.endsWith("?")) {
                System.out.println("Bob: Sure."); // Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
            } else if (userInput.endsWith("!")) {
                System.out.println("Bob: Whoa, chill out!"); // He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
            } else {
                System.out.println("Bob: Whatever."); // He answers 'Whatever.' to anything else.
            }
        }
    }
}
