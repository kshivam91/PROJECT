import java.util.Scanner;
import utils.Validator;

public class UserRegistration {

    public static User registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        String email;
        while (true) {
            try {
                System.out.print("Enter your email: ");
                email = scanner.nextLine();
                if (Validator.isValidEmail(email)) {
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid email. Please enter a valid email.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        String password;
        while (true) {
            try {
                System.out.print("Enter your password (minimum 6 characters): ");
                password = scanner.nextLine();
                if (Validator.isValidPassword(password)) {
                    break;
                } else {
                    throw new IllegalArgumentException("Password is too short. Please enter at least 6 characters.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        return new User(name, email, password);
    }
}
