import java.util.*;

public class TrainConsistManagementApp {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String toString() {
            return name + " - Capacity: " + capacity;
        }
    }

    public static void main(String[] args) {

        // ================= UC7 =================
        System.out.println("=== UC7: Sort Bogies by Capacity ===");

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        for (Bogie b : bogies) {
            System.out.println(b);
        }


        // ================= UC8 =================
        System.out.println("\n=== UC8: Filter Passenger Bogies Using Streams ===");

        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));
        bogieList.add(new Bogie("First Class", 24));
        bogieList.add(new Bogie("Super Luxury", 80));

        List<Bogie> filteredBogies =
                bogieList.stream()
                        .filter(b -> b.capacity > 60)
                        .toList();

        System.out.println("Bogies with capacity greater than 60:");

        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

    }
}