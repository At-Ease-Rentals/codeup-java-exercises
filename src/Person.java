public class Person implements Greeter {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        if(firstName == null || lastName == null) {
            throw new IllegalArgumentException("First name and Last name cannot be null");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String sayHello() {
//        return "Hello from " + firstName + " " + lastName;
//
        return String.format("Hello from %s %s.", firstName, lastName);
    }

    public static class TestPerson {
       public static void main(String[] args) {
           Person person = new Person("micheal", "jackson");
           System.out.println("Test Person:" + person.sayHello());
       }
    }
}