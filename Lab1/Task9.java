package Lab1;
public class Task9 {
    public static void main(String[] args) {
        // Check if we have exactly 2 arguments
        if (args.length != 2) {
            System.out.println("Usage: java Task9 <width> <height>");
            System.exit(1);
        }

        // Convert arguments to doubles
        double width = Double.parseDouble(args[0]); // to pass
        double height = Double.parseDouble(args[1]);

        // Calculate area and perimeter
        double area = width * height;
        double perimeter = 2 * (width + height);

        // Classify the rectangle
        String classification;
        if (width == height) {
            classification = "Square";
        } else {
            classification = "Rectangle";
        }

        // Output results
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Classification: " + classification);
    }
}