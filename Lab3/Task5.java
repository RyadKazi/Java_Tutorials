import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int R = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int C = sc.nextInt();

        int[][] matrix = new int[R][C];

        System.out.println("Enter the matrix values:");
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int totalSum = 0;

        System.out.println("Row sums:");
        for (int i = 0; i < R; i++) {
            int rowSum = 0;
            for (int j = 0; j < C; j++) {
                rowSum += matrix[i][j];
            }
            totalSum += rowSum;
            System.out.println(rowSum);
        }

        System.out.println("Column sums:");
        for (int j = 0; j < C; j++) {
            int colSum = 0;
            for (int i = 0; i < R; i++) {
                colSum += matrix[i][j];
            }
            System.out.println(colSum);
        }

        // Total sum
        System.out.println("Total sum:");
        System.out.println(totalSum);

        sc.close();
    }
}