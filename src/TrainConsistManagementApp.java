import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC6: Map Bogie to Capacity using HashMap

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Adding bogie and capacity
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 48);

        System.out.println("Bogie Capacity Details:");

        // Iterating using entrySet
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> Capacity: " + entry.getValue());
        }
    }
}