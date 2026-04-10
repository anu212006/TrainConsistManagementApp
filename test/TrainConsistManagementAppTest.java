import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // UC8 TEST 1
    @Test
    void testFilter_CapacityGreaterThanThreshold() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Luxury", 80));

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .toList();

        assertEquals(2, filtered.size());
    }


    // UC8 TEST 2
    @Test
    void testFilter_NoBogiesMatching() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 70)
                        .toList();

        assertTrue(filtered.isEmpty());
    }


    // UC8 TEST 3
    @Test
    void testFilter_OriginalListUnchanged() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        int originalSize = bogies.size();

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .toList();

        assertEquals(originalSize, bogies.size());
    }
}