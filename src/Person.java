public class Person implements Greeter {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        if(firstName == null || lastName == null) {
            throw new IllegalArgumentException("firstName and lastName cannot be null");
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
        return "Hello from " + firstName + " " + lastName;
    }
}