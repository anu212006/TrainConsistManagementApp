import java.util.*;
import java.util.stream.Collectors;

class Bogie {

    String name;
    int capacity;
    String type;

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ") - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC10: Count Total Seats using reduce() ===");

        // Create Bogie List
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Second Sitting", 90, "Passenger"));

        System.out.println("\nAvailable Bogies:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Step 1: Extract capacity using map()
        // Step 2: Sum using reduce()

        int totalSeats =
                bogies.stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        System.out.println("\nTotal Seating Capacity: " + totalSeats);

        System.out.println("\nUC10 Execution Completed.");
    }
}