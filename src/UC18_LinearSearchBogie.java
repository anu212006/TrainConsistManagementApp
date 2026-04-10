package com.train.uc18;

public class UC18_LinearSearchBogie {

    // Linear Search Method
    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        // Traverse the array sequentially
        for (int i = 0; i < bogieIds.length; i++) {

            // Compare each element
            if (bogieIds[i].equals(searchKey)) {

                // Match found
                return true;
            }
        }

        // No match found
        return false;
    }

    // Main Method (for running program)
    public static void main(String[] args) {

        // Create array of bogie IDs
        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        // Bogie to search
        String searchKey = "BG309";

        // Call search method
        boolean found = searchBogie(bogieIds, searchKey);

        // Display result
        if (found) {
            System.out.println("Bogie Found: " + searchKey);
        } else {
            System.out.println("Bogie Not Found: " + searchKey);
        }
    }
}