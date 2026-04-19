package Lab3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read R, C, and K
        if (!sc.hasNextInt())
            return;
        int R = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();

        // Read the seating matrix (0 = available, 1 = taken)
        int[][] classroom = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                classroom[i][j] = sc.nextInt();
            }
        }

        // Search for the first block of K consecutive available seats
        boolean found = false;

        // Loop through rows (earliest row first)
        for (int i = 0; i < R; i++) {
            int consecutiveCount = 0;
            int startSeat = -1;

            // Loop through columns in the current row
            for (int j = 0; j < C; j++) {
                if (classroom[i][j] == 0) {
                    if (consecutiveCount == 0) {
                        startSeat = j; // Potential start of a block
                    }
                    consecutiveCount++;

                    // Check if we found a block of size K
                    if (consecutiveCount == K) {
                        System.out.println("Row = " + i + ", StartSeat = " + startSeat);
                        found = true;
                        break; // Exit column loop
                    }
                } else {
                    // Reset count if a '1' (taken seat) is encountered
                    consecutiveCount = 0;
                    startSeat = -1;
                }
            }

            if (found)
                break; // Exit row loop once the first valid block is found
        }

        if (!found) {
            System.out.println("No block found");
        }

        sc.close();
    }
}