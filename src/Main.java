import Project.WorkoutPlan;
import Project.User;
import Project.FitnessApp;

public class Main {
    public static void main(String[] args) {
        WorkoutPlan workout1 = new WorkoutPlan("Advanced Cardio", 60, "High-intensity cardio for advanced fitness levels.");
        WorkoutPlan workout2 = new WorkoutPlan("Strength Training", 45, "Strength building with weight lifting.");
        WorkoutPlan workout3 = new WorkoutPlan();

        System.out.println("Workout Plan 1:");
        workout1.displayWorkoutPlan();
        System.out.println("Workout Plan 2:");
        workout2.displayWorkoutPlan();
        System.out.println("Workout Plan 3:");
        workout3.displayWorkoutPlan();

        User user1 = new User("Alice", "alice@example.com", 30);
        User user2 = new User("Bob", "bob@example.com", 28);
        User user3 = new User(); // Default user

        System.out.println("User 1:");
        user1.displayUser();
        System.out.println("User 2:");
        user2.displayUser();
        System.out.println("User 3:");
        user3.displayUser();

        FitnessApp fitnessApp1 = new FitnessApp("FitPro", "Workout Tracker");
        FitnessApp fitnessApp2 = new FitnessApp("HealthPal", "Nutrition & Health");
        FitnessApp fitnessApp3 = new FitnessApp();

        System.out.println("Fitness App 1:");
        fitnessApp1.displayFitnessApp();
        System.out.println("Fitness App 2:");
        fitnessApp2.displayFitnessApp();
        System.out.println("Fitness App 3:");
        fitnessApp3.displayFitnessApp();
    }
}
