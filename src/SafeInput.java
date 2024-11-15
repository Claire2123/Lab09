import java.util.Scanner;

public class SafeInput {
    private static Scanner sc = new Scanner(System.in);

    // Method to get a ranged integer from the user
    public static int getRangedInt(String prompt, int low, int high) {
        int input = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (input >= low && input <= high) {
                    valid = true;
                } else {
                    System.out.println("Error: Please enter an integer between " + low + " and " + high + ".");
                }
            } else {
                System.out.println("Error: Please enter a valid integer.");
                sc.next(); // Consume the invalid input
            }
        }
        return input;
    }
}