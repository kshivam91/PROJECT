import java.util.*;
package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    // Validate Email Format
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Validate Password Length
    public static boolean isValidPassword(String password) {
        return password.length() >= 6;
    }
}
