package Lab2;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        scanner.close();

        if (password.length() < 8 || password.length() > 16) {
            System.out.println("REJECTED: length must be between 8 and 16");
            return;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (c == ' ') {
                System.out.println("REJECTED: must not contain spaces");
                return;
            }

            if (c >= 'A' && c <= 'Z') {
                hasUpper = true;
            } else if (c >= 'a' && c <= 'z') {
                hasLower = true;
            } else if (c >= '0' && c <= '9') {
                hasDigit = true;
            } else if (c == '@' || c == '#' || c == '$' || c == '%' || c == '!' || c == '&') {
                hasSpecial = true;
            }

            if (i >= 2) {
                if (password.charAt(i) == password.charAt(i - 1) &&
                    password.charAt(i) == password.charAt(i - 2)) {
                    System.out.println("REJECTED: same character repeated 3 times in a row");
                    return;
                }
            }
        }

        if (!hasUpper) {
            System.out.println("REJECTED: must contain at least one uppercase letter");
            return;
        }

        if (!hasLower) {
            System.out.println("REJECTED: must contain at least one lowercase letter");
            return;
        }

        if (!hasDigit) {
            System.out.println("REJECTED: must contain at least one digit");
            return;
        }

        if (!hasSpecial) {
            System.out.println("REJECTED: must contain at least one special character (@ # $ % ! &)");
            return;
        }

        System.out.println("ACCEPTED");
    }
}
