import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // Exercise 1: While Loop
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        System.out.println("");

        // Exercise 2: Do-While Loop
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);

        System.out.println("");

        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k >= -10);

        long l = 2;
        do {
            System.out.println(l);
            l *= l;
        } while (l < 1_000_000);

        // Exercise 3: For Loop
        for (int m = 5; m <= 15; m++) {
            System.out.println(m);
        }
        System.out.println("");

        for (int n = 0; n <= 100; n += 2) {
            System.out.println(n);
        }
        System.out.println("");

        for (int o = 100; o >= -10; o -= 5) {
            System.out.println(o);
        }
        System.out.println("");

        for (long p = 2; p < 1_000_000; p *= p) {
            System.out.println(p);
        }
        System.out.println("");

        // Exercise 4: FizzBuzz
        for (int q = 1; q <= 100; q++) {
            if (q % 3 == 0 && q % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (q % 3 == 0) {
                System.out.println("Fizz");
            } else if (q % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(q);
            }
        }

        // Exercise 5: Display a table of powers
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to? ");
        int num = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.printf("%-6s | %-7s | %-5s%n", "number", "squared", "cubed");
        System.out.println("------ | ------- | -----");
        for (int r = 1; r <= num; r++) {
            System.out.printf("%-6d | %-7d | %-5d%n", r, r * r, r * r * r);
        }

        // Exercise 6: Convert grades into letter grades
        char choice;
        do {
            System.out.print("Enter a numerical grade: ");
            int grade = scanner.nextInt();
            char letterGrade;

            if (grade >= 88 && grade <= 100) {
                letterGrade = 'A';
            } else if (grade >= 80 && grade <= 87) {
                letterGrade = 'B';
            } else if (grade >= 67 && grade <= 79) {
                letterGrade = 'C';
            } else if (grade >= 60 && grade <= 66) {
                letterGrade = 'D';
            } else {
                letterGrade = 'F';
            }

            System.out.println("Letter grade: " + letterGrade);

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Goodbye!");

        scanner.close();
    }
}
