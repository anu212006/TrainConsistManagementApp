import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    // Helper method to create bogie list
    private List<Bogie> createBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Second Sitting", 90));

        return bogies;
    }

    // Test 1: Capacity greater than threshold
    @Test
    void testFilter_CapacityGreaterThanThreshold() {

        List<Bogie> bogies = createBogieList();

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 70)
                        .collect(Collectors.toList());

        assertEquals(2, filtered.size());
    }

    // Test 2: Capacity equal to threshold
    @Test
    void testFilter_CapacityEqualToThreshold() {

        List<Bogie> bogies = createBogieList();

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 72)
                        .collect(Collectors.toList());

        assertEquals(1, filtered.size());
    }

    // Test 3: Capacity less than threshold
    @Test
    void testFilter_CapacityLessThanThreshold() {

        List<Bogie> bogies = createBogieList();

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 100)
                        .collect(Collectors.toList());

        assertTrue(filtered.isEmpty());
    }

    // Test 4: Multiple matching bogies
    @Test
    void testFilter_MultipleBogiesMatching() {

        List<Bogie> bogies = createBogieList();

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertEquals(2, filtered.size());
    }

    // Test 5: No matching bogies
    @Test
    void testFilter_NoBogiesMatching() {

        List<Bogie> bogies = createBogieList();

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 200)
                        .collect(Collectors.toList());

        assertEquals(0, filtered.size());
    }

    // Test 6: All bogies matching
    @Test
    void testFilter_AllBogiesMatching() {

        List<Bogie> bogies = createBogieList();

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 10)
                        .collect(Collectors.toList());

        assertEquals(bogies.size(), filtered.size());
    }

    // Test 7: Empty list
    @Test
    void testFilter_EmptyBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertTrue(filtered.isEmpty());
    }

    // Test 8: Original list unchanged
    @Test
    void testFilter_OriginalListUnchanged() {

        List<Bogie> bogies = createBogieList();

        int originalSize = bogies.size();

        List<Bogie> filtered =
                bogies.stream()
                        .filter(b -> b.capacity > 60)
                        .collect(Collectors.toList());

        assertEquals(originalSize, bogies.size());
    }
}