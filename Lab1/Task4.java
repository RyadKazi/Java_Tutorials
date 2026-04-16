package Lab1;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount;
        do {
            System.out.print("Enter the amount: ");
            amount = scanner.nextInt();
        } while (amount < 0 || amount > 9999);

        int count200 = 0;
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;
        int count2 = 0;
        int count1 = 0;

        while (amount > 0) {
            if (amount >= 200) {
                amount -= 200;
                count200 += 1;
            } else if (amount >= 100) {
                amount -= 100;
                count100 += 1;
            } else if (amount >= 50) {
                amount -= 50;
                count50 += 1;
            } else if (amount >= 20) {
                amount -= 20;
                count20 += 1;
            } else if (amount >= 10) {
                amount -= 10;
                count10 += 1;
            } else if (amount >= 5) {
                amount -= 5;
                count5 += 1;
            } else if (amount >= 2) {
                amount -= 2;
                count2 += 1;
            } else if (amount >= 1) {
                amount -= 1;
                count1 += 1;
            }
        }

        System.out.println("200c: " + count200);
        System.out.println("100c: " + count100);
        System.out.println("50c: " + count50);
        System.out.println("20c: " + count20);
        System.out.println("10c: " + count10);
        System.out.println("5c: " + count5);
        System.out.println("2c: " + count2);
        System.out.println("1c: " + count1);

        scanner.close();

    }
}