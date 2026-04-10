import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    private List<Bogie> createBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 56, "Passenger"));
        bogies.add(new Bogie("First Class", 24, "Passenger"));
        bogies.add(new Bogie("Cargo Rectangular", 100, "Goods"));
        bogies.add(new Bogie("Cargo Cylindrical", 120, "Goods"));

        return bogies;
    }

    @Test
    void testGrouping_BogiesGroupedByType() {

        List<Bogie> bogies = createBogieList();

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        assertTrue(grouped.containsKey("Passenger"));
        assertTrue(grouped.containsKey("Goods"));
    }

    @Test
    void testGrouping_MultipleBogiesInSameGroup() {

        List<Bogie> bogies = createBogieList();

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        assertEquals(3, grouped.get("Passenger").size());
    }

    @Test
    void testGrouping_DifferentBogieTypes() {

        List<Bogie> bogies = createBogieList();

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        assertEquals(2, grouped.size());
    }

    @Test
    void testGrouping_EmptyBogieList() {

        List<Bogie> bogies = new ArrayList<>();

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        assertTrue(grouped.isEmpty());
    }

    @Test
    void testGrouping_SingleBogieCategory() {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        assertEquals(1, grouped.size());
    }

    @Test
    void testGrouping_MapContainsCorrectKeys() {

        List<Bogie> bogies = createBogieList();

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        assertTrue(grouped.containsKey("Passenger"));
        assertTrue(grouped.containsKey("Goods"));
    }

    @Test
    void testGrouping_GroupSizeValidation() {

        List<Bogie> bogies = createBogieList();

        Map<String, List<Bogie>> grouped =
                bogies.stream()
                        .collect(Collectors.groupingBy(b -> b.type));

        assertEquals(2, grouped.get("Goods").size());
    }

    @Test
    void testGrouping_OriginalListUnchanged() {

        List<Bogie> bogies = createBogieList();

        int originalSize = bogies.size();

        bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        assertEquals(originalSize, bogies.size());
    }
}