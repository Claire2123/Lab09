import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] dataPoints = new int[100];

        // Create a Random object to generate random values
        Random random = new Random();

        // Loop through the array and assign random values between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = random.nextInt(100) + 1; // Random value between 1 and 100
        }

        // Loop to display the values in the format "val1 | val2 | val3 | ..."
        System.out.print("The values in the dataPoints array are: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]); // Print the value
            if (i < dataPoints.length - 1) {
                System.out.print(" | "); // Print " | " between values, but not after the last value
            }
        }
        System.out.println(); // Print a newline after the values

        // Calculate the sum and the average
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i]; // Accumulate the sum of the elements
        }

        // Calculate the average using the static getAverage method
        double average = getAverage(dataPoints);  // Calling the static method

        // Display the sum and average with descriptive output
        System.out.println("The sum of the values in the dataPoints array is: " + sum);
        System.out.println("The average of the values in the dataPoints array is: " + average);

        // Prompt user for an integer between 1 and 100
        int userInput = SafeInput.getRangedInt("Please enter an integer between 1 and 100: ", 1, 100);

        // Display the user input
        System.out.println("You entered: " + userInput);

        // Search for the user's value in the array and short-circuit if found
        boolean found = false;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userInput) {
                // If the value is found, display the index and break the loop
                System.out.println("The value " + userInput + " was found at array index " + i + ".");
                found = true;
                break; // Exit the loop as soon as the value is found
            }
        }

        // If the value was not found, inform the user
        if (!found) {
            System.out.println("The value " + userInput + " was not found in the dataPoints array.");
        }

        // Initialize min and max variables with the first element of the array
        int min = dataPoints[0];
        int max = dataPoints[0];

        // Loop through the array to find the minimum and maximum values
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i]; // Update min if a smaller value is found
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i]; // Update max if a larger value is found
            }
        }

        // Display the minimum and maximum values
        System.out.println("The minimum value in the dataPoints array is: " + min);
        System.out.println("The maximum value in the dataPoints array is: " + max);
    }

    // Static method to calculate the average of an array of int values
    public static double getAverage(int values[]) {
        double sum = 0;  // Initialize sum as double to avoid integer division
        for (int i = 0; i < values.length; i++) {
            sum += values[i];  // Add each value to the sum
        }
        return sum / values.length;  // Return the average as a double
    }
}



