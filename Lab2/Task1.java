package Lab2;
import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        if (input == null || input.length() == 0) {
            System.out.println("");
            return;
        }

        StringBuilder result = new StringBuilder();

        char currentChar = input.charAt(0);
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(currentChar).append(count);
                currentChar = input.charAt(i);
                count = 1;
            }
        }

        result.append(currentChar).append(count);

        System.out.println(result.toString());
    }
}

