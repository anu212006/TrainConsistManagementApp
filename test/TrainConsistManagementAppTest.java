import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    // Loop Filtering Test
    @Test
    void testLoopFilteringLogic() {

        List<TrainConsistManagementApp.Bogie> bogies =
                new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC", 56));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterUsingLoop(bogies);

        assertEquals(1, result.size());
    }

    // Stream Filtering Test
    @Test
    void testStreamFilteringLogic() {

        List<TrainConsistManagementApp.Bogie> bogies =
                new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC", 56));

        List<TrainConsistManagementApp.Bogie> result =
                TrainConsistManagementApp.filterUsingStream(bogies);

        assertEquals(1, result.size());
    }

    // Compare Loop vs Stream Results
    @Test
    void testLoopAndStreamResultsMatch() {

        List<TrainConsistManagementApp.Bogie> bogies =
                new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));
        bogies.add(new TrainConsistManagementApp.Bogie("AC", 56));
        bogies.add(new TrainConsistManagementApp.Bogie("First", 64));

        List<?> loopResult =
                TrainConsistManagementApp.filterUsingLoop(bogies);

        List<?> streamResult =
                TrainConsistManagementApp.filterUsingStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }

    // Execution Time Test
    @Test
    void testExecutionTimeMeasurement() {

        List<TrainConsistManagementApp.Bogie> bogies =
                new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.Bogie("Sleeper", 72));

        long loopTime =
                TrainConsistManagementApp.measureLoopTime(bogies);

        long streamTime =
                TrainConsistManagementApp.measureStreamTime(bogies);

        assertTrue(loopTime >= 0);
        assertTrue(streamTime >= 0);
    }

    // Large Dataset Test
    @Test
    void testLargeDatasetProcessing() {

        List<TrainConsistManagementApp.Bogie> bogies =
                new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            bogies.add(
                    new TrainConsistManagementApp.Bogie(
                            "Sleeper",
                            50 + (i % 30)
                    )
            );
        }

        List<?> result =
                TrainConsistManagementApp.filterUsingStream(bogies);

        assertNotNull(result);
    }
}