package Lab1;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day's number: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("It's a weekday.");
                break;
            case 6:
            case 7:
                System.out.println("It's a weekend.");
                break;
            default:
                System.out.println("Invalid day.");
                break;
        }

        scanner.close();

    }
}