package Lab2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        int k = scanner.nextInt();
        scanner.close();

        k = ((k % 26) + 26) % 26;

        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (c >= 'a' && c <= 'z') {
                char newChar = (char) ('a' + (c - 'a' + k) % 26);
                encrypted.append(newChar);

            } else if (c >= 'A' && c <= 'Z') {
                char newChar = (char) ('A' + (c - 'A' + k) % 26);
                encrypted.append(newChar);

            } else {
                // Non-letters stay unchanged
                encrypted.append(c);
            }
        }

        System.out.println(encrypted.toString());
    }
}

