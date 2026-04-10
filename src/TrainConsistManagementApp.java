import java.util.*;

public class TrainConsistManagementApp {

    // ============================
    // Custom Exception
    // ============================

    static class InvalidCapacityException extends Exception {

        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    // ============================
    // Passenger Bogie Class
    // ============================

    static class PassengerBogie {

        String name;
        int capacity;

        // Constructor with validation
        PassengerBogie(String name, int capacity)
                throws InvalidCapacityException {

            if (capacity <= 0) {
                throw new InvalidCapacityException(
                        "Capacity must be greater than zero"
                );
            }

            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    // ============================
    // MAIN METHOD (Demo)
    // ============================

    public static void main(String[] args) {

        System.out.println("=== UC14: Custom Exception Handling ===");

        try {

            PassengerBogie bogie1 =
                    new PassengerBogie("Sleeper", 72);

            PassengerBogie bogie2 =
                    new PassengerBogie("AC Chair", 56);

            System.out.println("Created Bogies:");
            System.out.println(bogie1);
            System.out.println(bogie2);

            // Invalid Example
            PassengerBogie invalidBogie =
                    new PassengerBogie("First Class", 0);

        }
        catch (InvalidCapacityException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}