package Lab0;
public class BasicSyntax {
public static void main(String[] args) {
// Declare and initialize variables
int number = 10;
double decimal = 5.5;
String text = "Java is fun!";
Boolean is_10 = false ;
// Print variables
System.out.println("Number: " + number);
System.out.println("Decimal: " + decimal);
System.out.println("Text: " + text);
// Perform arithmetic operations
int sum = number + (int) decimal; // Casting double to int
System.out.println("Sum: " + sum);
// Use a loop
for (int i = 0; i < 5; i++) {
System.out.println("Loop iteration: " + i);
}
// Use a conditional statement
if (number > 5) {
System.out.println("Number is greater than 5");
} else {
System.out.println("Number is 5 or less");
}
if (number == 10) {
    is_10 = true;
}
if (is_10) {
    System.out.println("Number is equal to 10!");
}
}}