package Lab2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        int i = 0;
        int count = 0;

        while (i < line.length()) {

            // Skip spaces
            while (i < line.length() && line.charAt(i) == ' ') {
                i++;
            }

            // If we reached the end, break
            if (i >= line.length()) {
                break;
            }

            // Start of a word
            int start = i;

            // Move until space or end
            while (i < line.length() && line.charAt(i) != ' ') {
                i++;
            }

            // Extract and print word
            String word = line.substring(start, i);
            System.out.println(word);
            count++;
        }

        System.out.println("Total words: " + count);
    }
}
