import java.util.Scanner;

public class Task3 {

    // Function to count occurrences
    static int countOccurrences(int[] a, int target) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of elements: ");
        int N = sc.nextInt();

        int[] arr = new int[N];

        System.out.println("Enter " + N + " integers:");
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        // Call function
        int result = countOccurrences(arr, target);

        // Output
        System.out.println("target appears " + result + " times");
        
        sc.close();
    }
}