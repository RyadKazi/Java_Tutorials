package Lab1;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println("No data.");
        } else {

            int sum = num;
            int count = 0;

            while (num != 0) {

                count += 1;
                System.out.print("Enter a number: ");
                num = scanner.nextInt();

                if (num == 0) {
                    break;
                }

                sum += num;

            }

            double average = (double) sum / count;

            System.out.println("Sum: " + sum);
            System.out.println("Count: " + count);
            System.out.printf("Average: %.2f", average);

        }

        scanner.close();

    }
}