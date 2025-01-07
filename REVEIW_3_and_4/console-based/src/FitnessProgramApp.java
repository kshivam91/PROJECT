import java.util.Scanner;

public class FitnessProgramApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Online Fitness Program!");
        
        // User Registration
        User user = UserRegistration.registerUser();
        System.out.println("Registration successful! Welcome, " + user.getName() + "!");
        
        // Main menu for workout tracking
        while (true) {
            System.out.println("\n1. Log Workout");
            System.out.println("2. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                // Log workout for the user
                WorkoutTracker.logWorkout(user.getName());
            } else if (choice == 2) {
                System.out.println("Thank you for using the Online Fitness Program. Goodbye!");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
