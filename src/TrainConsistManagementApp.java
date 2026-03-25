import java.util.ArrayList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC2: Add Passenger Bogies to Train

        ArrayList<String> passengerBogies = new ArrayList<>();

        // Adding bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after adding:");
        System.out.println(passengerBogies);

        // Removing a bogie
        passengerBogies.remove("AC Chair");

        System.out.println("Bogies after removal:");
        System.out.println(passengerBogies);

        // Checking existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present");
        } else {
            System.out.println("Sleeper bogie is NOT present");
        }

        System.out.println("Final Bogie List:");
        System.out.println(passengerBogies);
    }
}