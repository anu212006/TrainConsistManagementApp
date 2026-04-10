import java.util.Arrays;

public class TrainConsistManagementApp {

    // Bubble Sort Method
    public static int[] bubbleSort(int[] capacities) {

        int n = capacities.length;

        // Outer loop (number of passes)
        for (int i = 0; i < n - 1; i++) {

            // Inner loop (compare adjacent values)
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if left > right
                if (capacities[j] > capacities[j + 1]) {

                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;

                }
            }
        }

        return capacities;
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("=== UC16: Bubble Sort Passenger Capacities ===");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(capacities));

        // Call bubble sort
        bubbleSort(capacities);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(capacities));

        System.out.println("Sorting completed successfully.");
    }
}