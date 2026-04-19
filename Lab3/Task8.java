package Lab3;

import java.util.Scanner;

public class Task8 {

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static int reverseNumber(int n) {
        return reverseHelper(n, 0);
    }

    private static int reverseHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        return reverseHelper(n / 10, reversed * 10 + (n % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Sum of digits: 0");
            System.out.println("Reversed number: 0");
        } else {
            System.out.println("Sum of digits: " + sumDigits(n));
            System.out.println("Reversed number: " + reverseNumber(n));
        }

        sc.close();
    }
}