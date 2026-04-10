import java.util.Arrays;
import java.util.Scanner;

public class BogieSearchBinary {

    // Binary Search Method
    public static boolean binarySearchBogie(String[] bogieIds, String key) {

        // Handle empty array
        if (bogieIds == null || bogieIds.length == 0) {
            return false;
        }

        // Ensure data is sorted (handles unsorted input case)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            // Compute mid index
            int mid = (low + high) / 2;

            // Compare key with middle element
            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                // Match found
                return true;
            }

            else if (result < 0) {
                // Search left half
                high = mid - 1;
            }

            else {
                // Search right half
                low = mid + 1;
            }
        }

        // Key not found
        return false;
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of bogies
        System.out.print("Enter number of bogie IDs: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        // Input bogie IDs
        System.out.println("Enter bogie IDs:");

        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        // Input search key
        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        // Perform Binary Search
        boolean found = binarySearchBogie(bogieIds, key);

        // Display result
        if (found) {
            System.out.println("Bogie ID Found");
        } else {
            System.out.println("Bogie ID Not Found");
        }

        sc.close();
    }
}