import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC5: Preserve Insertion Order using LinkedHashSet

        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Adding duplicate intentionally
        trainFormation.add("Sleeper"); // duplicate

        System.out.println("Final Train Formation (No duplicates, Order maintained):");
        System.out.println(trainFormation);
    }
}