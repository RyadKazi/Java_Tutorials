package Lab1;
public class Task10 {
    public static void main(String[] args) {
        // Check if we have exactly 3 arguments
        if (args.length != 3) {
            System.out.println("Usage: java Task10 <id> <role> <time>");
            System.exit(1);
        }

        // Parse command-line arguments
        int id = Integer.parseInt(args[0]);
        String role = args[1];
        int time = Integer.parseInt(args[2]);

        // Check if role is valid
        if (!role.equals("student") && !role.equals("ta") && !role.equals("staff")) {
            System.out.println("ACCESS DENIED - Invalid role.");
            System.exit(0);
        }

        // Apply access rules
        boolean accessGranted = false;
        String reason = "";

        if (role.equals("staff")) {
            accessGranted = true;
            reason = "Staff always allowed.";
        } else if (role.equals("ta")) {
            if (time >= 8 && time <= 20) {
                accessGranted = true;
                reason = "TA allowed during hours 8-20.";
            } else {
                accessGranted = false;
                reason = "TA not allowed outside hours 8-20.";
            }
        } else if (role.equals("student")) {
            if (time >= 9 && time <= 17 && id % 2 == 0) {
                accessGranted = true;
                reason = "Student meets time and ID requirements.";
            } else {
                accessGranted = false;
                if (time < 9 || time > 17) {
                    reason = "Student not allowed outside hours 9-17.";
                } else {
                    reason = "Student ID must be even.";
                }
            }
        }

        // Output result
        if (accessGranted) {
            System.out.println("ACCESS GRANTED - " + reason);
        } else {
            System.out.println("ACCESS DENIED - " + reason);
        }
    }
}