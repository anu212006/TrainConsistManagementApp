import java.util.Arrays;

public class TrainConsistManagementApp {

    // Method to sort bogie names
    public static String[] sortBogieNames(String[] bogieNames) {

        // Using built-in sorting method
        Arrays.sort(bogieNames);

        return bogieNames;
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("=== UC17: Sort Bogie Names Using Arrays.sort() ===");

        // Bogie names array
        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        // Call sorting method
        sortBogieNames(bogieNames);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("Sorting completed successfully.");
    }
}