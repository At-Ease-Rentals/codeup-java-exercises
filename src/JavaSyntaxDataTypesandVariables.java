public class JavaSyntaxDataTypesandVariables {

    public static void  main(String[] args){
        System.out.println("Hello, World! ");
        {
            System.out.println("Code inside of curly braces should be indented");
            System.out.println("with four spaces");

    // I am a single line comment

    /* I take up one line */

/*
 * I take up
 * multiple
 * lines
 */
    int id;
    boolean isLoggedIn;
    float bankAccountBalance;

    id = 123;
    isLoggedIn = false;
    bankAccountBalance = 100.23F;

    int myNumber = 12 + 12 * 2;
    myNumber += 9;

            System.out.println(isLoggedIn + "\n" + id + "\n" + bankAccountBalance + "\n" + myNumber);

    int myInteger = 900;
    long morePrecise = myInteger;

            System.out.println(morePrecise + "\n" + myInteger);

    double pi = 3.14159;
    int almostPi = (int) pi;

            System.out.println(pi + "\n" + almostPi);
        }
    }
}
