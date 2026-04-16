package Lab1;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.println("Enter a number between 10 and 50: ");
            n = scanner.nextInt();
        } while (n < 10 || n > 50);

        System.out.println("The square of " + n + " is: " + (n * n));

        scanner.close();
    }
}