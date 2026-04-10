import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC8: Filter Passenger Bogies Using Streams

        System.out.println("=== UC8: Filter Passenger Bogies Using Streams ===");

        // Create Bogie List (reuse UC7 style)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 90));

        System.out.println("\nAll Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Filter bogies with capacity > 60
        List<Bogie> filteredBogies =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");

        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        System.out.println("\nUC8 Execution Completed.");
    }
}