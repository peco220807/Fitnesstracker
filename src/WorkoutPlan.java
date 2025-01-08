
public class WorkoutPlan {
    private String workoutType;
    private int duration;
    private int intensity;

    public WorkoutPlan(String workoutType, int duration, int intensity) {
        this.workoutType = workoutType;
        this.duration = duration;
        this.intensity = intensity;
    }

    public WorkoutPlan() {
        this.workoutType = "Cardio";
        this.duration = 30;
        this.intensity = 5;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public void setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public void displayWorkoutPlan() {
        System.out.println("Workout Type: " + workoutType);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Intensity: " + intensity);
    }
}