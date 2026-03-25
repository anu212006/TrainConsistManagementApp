import java.util.HashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC3: Track Unique Bogie IDs using HashSet

        HashSet<String> bogieIds = new HashSet<>();

        // Adding bogie IDs (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG102"); // duplicate

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIds);

    }
}