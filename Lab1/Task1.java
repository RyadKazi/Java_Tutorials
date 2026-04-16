package Lab1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quizGrade;
        do {
            System.out.print("Enter the quiz's grade: ");
            quizGrade = scanner.nextDouble(); // need to use nextInt() to read an integer input
        } while (quizGrade < 0 || quizGrade > 100);

        double midtermGrade;
        do {
            System.out.print("Enter the midterm's grade: ");
            midtermGrade = scanner.nextDouble();
        } while (midtermGrade < 0 || midtermGrade > 100);

        double finalGrade;
        do {
            System.out.print("Enter the final's grade: ");
            finalGrade = scanner.nextDouble();
        } while (finalGrade < 0 || finalGrade > 100);

        System.out.println("");

        double weightedAvergae = (quizGrade * 0.20) + (midtermGrade * 0.30) + (finalGrade * 0.50);
        System.out.printf("The weighted avarege is: %.2f%n", weightedAvergae);

        Boolean Status = (weightedAvergae >= 50);
        if (Status) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        Boolean Merit = (weightedAvergae >= 85);
        if (Merit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
