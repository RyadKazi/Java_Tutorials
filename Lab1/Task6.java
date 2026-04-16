package Lab1;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;
        do {
            System.out.print("Enter the integer N: ");
            N = scanner.nextInt();
        } while (N < 1);

        int Sum = 0;
        int num;
        int accepted = 0; // to use in the loop we must

        for (int i = 1; i <= N; i++) {
            System.out.print("Enter the number: ");
            num = scanner.nextInt();
            if (num < 0) {
                continue;
            } else if (num == 999) {
                break;
            } else {
                Sum += num;
                accepted += 1;
            }
        }

        System.out.println("Accepted numbers count: " + accepted);
        System.out.println("Sum: " + Sum);
        scanner.close();
    }
}