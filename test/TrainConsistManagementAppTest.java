import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    @Test
    void testSafety_AllBogiesValid() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Open", "Coal"));

        boolean result =
                TrainConsistManagementApp.checkSafetyCompliance(bogies);

        assertTrue(result);
    }

    @Test
    void testSafety_CylindricalWithInvalidCargo() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Coal"));

        boolean result =
                TrainConsistManagementApp.checkSafetyCompliance(bogies);

        assertFalse(result);
    }

    @Test
    void testSafety_NonCylindricalBogiesAllowed() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.GoodsBogie("Open", "Coal"));
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Box", "Grain"));

        boolean result =
                TrainConsistManagementApp.checkSafetyCompliance(bogies);

        assertTrue(result);
    }

    @Test
    void testSafety_MixedBogiesWithViolation() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new TrainConsistManagementApp.GoodsBogie("Cylindrical", "Coal"));

        boolean result =
                TrainConsistManagementApp.checkSafetyCompliance(bogies);

        assertFalse(result);
    }

    @Test
    void testSafety_EmptyBogieList() {

        List<TrainConsistManagementApp.GoodsBogie> bogies = new ArrayList<>();

        boolean result =
                TrainConsistManagementApp.checkSafetyCompliance(bogies);

        assertTrue(result);
    }
}