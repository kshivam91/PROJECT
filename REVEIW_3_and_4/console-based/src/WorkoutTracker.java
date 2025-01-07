import java.util.Scanner;

public class WorkoutTracker {

    public static void logWorkout(String userName) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + userName + "! Let's log your workout.");
        System.out.print("Enter the exercise type (e.g., Running, Swimming): ");
        String exerciseType = scanner.nextLine();

        System.out.print("Enter the duration of your workout (in minutes): ");
        int duration = scanner.nextInt();

        System.out.println("Workout logged: " + exerciseType + " for " + duration + " minutes.");
    }
}
