package antgantt;

public class Person {
        private String firstName;
        private String lastName;
        private byte age;


    @Deprecated
    public void sayHello(String extra){
        System.out.println("Hello");
    }
    public void sayHello(String extra){
        System.out.println("Hello" + extra);
    }
}

