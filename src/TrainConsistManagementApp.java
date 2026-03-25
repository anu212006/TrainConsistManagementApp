import java.util.LinkedList;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // UC4: Maintain Ordered Train Consist using LinkedList

        LinkedList<String> trainConsist = new LinkedList<>();

        // Adding bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert Pantry Car at position 2
        trainConsist.add(2, "Pantry");

        System.out.println("After adding Pantry Car:");
        System.out.println(trainConsist);

        // Remove first and last bogie
        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Final Train Consist:");
        System.out.println(trainConsist);
    }
}