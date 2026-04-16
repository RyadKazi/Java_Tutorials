package Lab1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter the integer: ");
            n = scanner.nextInt();
        } while (n < 1000 || n > 9999);

        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;

        Boolean Valid = ((a + d) == (b + c));

        if (Valid) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }

        scanner.close();
    }
}
