package Lab1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("");
        System.out.println("1.Celsius");
        System.out.println("2.Fahrenheit");
        System.out.println("3.Kilometers");
        System.out.println("4.Miles");

        System.out.print("Choose one of these options: ");
        int option = scanner.nextInt();

        System.out.print("Enter the value: ");
        double value = scanner.nextDouble();

        String label;

        switch (option) {
            case 1:
                value = (value * 9 / 5) + 32;
                label = "F";
                break;

            case 2:
                value = (value - 32) * 5 / 9;
                label = "C";
                break;

            case 3:
                value = value / 1.609;
                label = "miles";
                break;

            case 4:
                value = value * 1.609;
                label = "Km";
                break;

            default:
                label = "invalid";
        }

        System.out.printf("The new value is: %.2f %s%n", value, " ", label);

        scanner.close();
    }
}