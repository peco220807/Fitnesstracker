package Project;

public class User {
    private String Name;
    private String Email;
    private int age;

    public User(String Name, String Email, int age) {
        this.Name = Name;
        this.Email = Email;
        this.age = age;
    }

    public User() {
        this.Name = "John";
        this.Email = "john@gmail.com";
        this.age = 25;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayUser() {
        System.out.println("Hello, I'm user " + Name + "!");
        System.out.println("My email: " + Email);
        System.out.println("My age is " + age + " years. Nice to meet you!");
    }
}
