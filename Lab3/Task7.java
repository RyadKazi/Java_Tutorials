package Lab3;

import java.util.Scanner;

public class Task7 {

    // Returns the maximum value found in the matrix [cite: 50]
    public static int maxValue(int[][] m) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] > max) {
                    max = m[i][j];
                }
            }
        }
        return max;
    }

    // Returns true if the number of rows equals the number of columns [cite: 51]
    public static boolean isSquare(int[][] m) {
        if (m.length == 0)
            return true;
        return m.length == m[0].length;
    }

    // Computes the sum of elements where row index equals column index
    public static int sumMainDiagonal(int[][] m) {
        int sum = 0;
        // Only iterate once through the length of the diagonal
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions R and C [cite: 56]
        if (!sc.hasNextInt())
            return;
        int R = sc.nextInt();
        int C = sc.nextInt();

        // Read the RxC table of integers [cite: 52, 56]
        int[][] matrix = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // 1. Print whether it is square [cite: 53, 57]
        boolean square = isSquare(matrix);
        System.out.println("Square: " + (square ? "Yes" : "No"));

        // 2. Print max value [cite: 54, 57]
        System.out.println("Max: " + maxValue(matrix));

        // 3. Print diagonal sum if applicable [cite: 55, 57]
        if (square) {
            System.out.println("Diagonal sum: " + sumMainDiagonal(matrix));
        } else {
            System.out.println("No diagonal sum");
        }

        sc.close();
    }
}