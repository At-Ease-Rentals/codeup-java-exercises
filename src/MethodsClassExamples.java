public class MethodsClassExamples {

    String greetings = "Hi";
    String name = "Courtne";
    int num = 3;
    public static String sayHello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static void sayHello(String greeting, String name) {
        System.out.printf("%s, %s!\n", greeting, name);
    }

    public static int returnThree() {
        return 3;
    }

    public static String shout(String s) {
        return s.toUpperCase() + "!!!";
    }

    public static void main(String[] args){



//        System.out.println(sayHello(name));
    }
}
