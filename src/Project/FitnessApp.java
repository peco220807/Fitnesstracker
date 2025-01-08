package Project;

public class FitnessApp {
    private String Name;
    private String Type;

    public FitnessApp(String Name, String Type) {
        this.Name = Name;
        this.Type = Type;
    }

    public FitnessApp() {
        this.Name = "MyFitnessApp";
        this.Type = "Health & Fitness";
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void displayFitnessApp() {
        System.out.println("Fitness App Name: " + Name);
        System.out.println("Type: " + Type);
    }
}