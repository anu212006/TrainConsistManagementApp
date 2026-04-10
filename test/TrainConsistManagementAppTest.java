import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    private List<Bogie> createBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));

        return bogies;
    }

    @Test
    void testReduce_TotalSeatCalculation() {

        List<Bogie> bogies = createBogieList();

        int total =
                bogies.stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        assertEquals(152, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72, "Passenger"));

        int total =
                bogies.stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        assertEquals(72, total);
    }

    @Test
    void testReduce_EmptyBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        int total =
                bogies.stream()
                        .map(b -> b.capacity)
                        .reduce(0, Integer::sum);

        assertEquals(0, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {

        List<Bogie> bogies = createBogieList();

        int originalSize = bogies.size();

        bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        assertEquals(originalSize, bogies.size());
    }
}