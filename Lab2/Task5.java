package Lab2;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        int counter = 0;
        boolean balanced = true;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
                if (counter < 0) {
                    balanced = false;
                    break;
                }
            }
        }

        if (counter != 0) {
            balanced = false;
        }

        if (balanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("NOT BALANCED");
        }
    }
}
