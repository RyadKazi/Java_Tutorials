package Lab3;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Enter a number: ");
            arr[i] = input.nextInt();
        }

        int min = arr[0], max = arr[0], sum = 0, evenCount = 0;
        for (int x : arr) {
            if (x < min)
                min = x;
            if (x > max)
                max = x;
            sum += x;
            if (x % 2 == 0)
                evenCount++;
        }
        double average = (double) sum / N;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Even count: " + evenCount);

        input.close();
    }
}