package Project;

public class WorkoutPlan {
    private String planName;
    private int durationInWeeks;
    private String difficultyLevel;

    public WorkoutPlan(String planName, int durationInWeeks, String difficultyLevel) {
        this.planName = planName;
        this.durationInWeeks = durationInWeeks;
        this.difficultyLevel = difficultyLevel;
    }

    public WorkoutPlan() {
        this.planName = "General Fitness";
        this.durationInWeeks = 4;
        this.difficultyLevel = "Beginner";
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getDurationInWeeks() {
        return durationInWeeks;
    }

    public void setDurationInWeeks(int durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public void displayWorkoutPlan() {
        System.out.println("Workout Plan: " + planName);
        System.out.println("Duration (weeks): " + durationInWeeks);
        System.out.println("Difficulty Level: " + difficultyLevel);
    }
}
