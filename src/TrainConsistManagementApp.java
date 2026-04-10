import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementApp {

    // Bogie Class (reuse structure from earlier UCs)
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }

    // LOOP FILTERING METHOD
    public static List<Bogie> filterUsingLoop(List<Bogie> bogies) {

        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                result.add(b);
            }
        }

        return result;
    }

    // STREAM FILTERING METHOD
    public static List<Bogie> filterUsingStream(List<Bogie> bogies) {

        return bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
    }

    // PERFORMANCE MEASUREMENT
    public static long measureLoopTime(List<Bogie> bogies) {

        long start = System.nanoTime();

        filterUsingLoop(bogies);

        long end = System.nanoTime();

        return end - start;
    }

    public static long measureStreamTime(List<Bogie> bogies) {

        long start = System.nanoTime();

        filterUsingStream(bogies);

        long end = System.nanoTime();

        return end - start;
    }

    // MAIN METHOD (Performance Demo)

    public static void main(String[] args) {

        System.out.println("=== UC13: Performance Comparison ===");

        List<Bogie> bogies = new ArrayList<>();

        // Create sample dataset
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 64));
        bogies.add(new Bogie("Second Sitting", 50));

        // LOOP TIME
        long loopTime = measureLoopTime(bogies);

        // STREAM TIME
        long streamTime = measureStreamTime(bogies);

        System.out.println("Loop Execution Time: " + loopTime + " ns");
        System.out.println("Stream Execution Time: " + streamTime + " ns");

        // Show results
        List<Bogie> loopResult = filterUsingLoop(bogies);
        List<Bogie> streamResult = filterUsingStream(bogies);

        System.out.println("Loop Result: " + loopResult);
        System.out.println("Stream Result: " + streamResult);
    }
}