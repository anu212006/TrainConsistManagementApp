import java.util.Arrays;

public class TrainSearchUC20 {

    // Binary Search with Exception Handling
    public static boolean searchBogie(String[] bogieIds, String key) {

        // UC20 Core Requirement:
        // Fail-fast validation
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException(
                    "Search operation failed: No bogies available in the train."
            );
        }

        // Sort before binary search (handles unsorted input)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true; // Found
            }

            else if (result < 0) {
                high = mid - 1; // Search left
            }

            else {
                low = mid + 1; // Search right
            }
        }

        return false; // Not found
    }
}