interface Greeter {
    String sayHello();
}

class GreeterTest {
    public static void main(String[] args) {
        // Test Greeter interface
        Greeter greeter = new Person("John", "Doe");
        System.out.println("Test Greeter: " + greeter.sayHello());
    }

}
