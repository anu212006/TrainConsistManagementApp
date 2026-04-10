import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    // testCargo_SafeAssignment
    @Test
    void testCargo_SafeAssignment() {

        GoodsBogie bogie =
                new GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals(
                "Petroleum",
                bogie.getCargo()
        );
    }

    // testCargo_UnsafeAssignmentHandled
    @Test
    void testCargo_UnsafeAssignmentHandled() {

        GoodsBogie bogie =
                new GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(
                bogie.getCargo()
        );
    }

    // testCargo_CargoNotAssignedAfterFailure
    @Test
    void testCargo_CargoNotAssignedAfterFailure() {

        GoodsBogie bogie =
                new GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(
                bogie.getCargo()
        );
    }

    // testCargo_ProgramContinuesAfterException
    @Test
    void testCargo_ProgramContinuesAfterException() {

        GoodsBogie bogie1 =
                new GoodsBogie("Rectangular");

        GoodsBogie bogie2 =
                new GoodsBogie("Cylindrical");

        bogie1.assignCargo("Petroleum");

        bogie2.assignCargo("Petroleum");

        assertEquals(
                "Petroleum",
                bogie2.getCargo()
        );
    }

    // testCargo_FinallyBlockExecution
    @Test
    void testCargo_FinallyBlockExecution() {

        GoodsBogie bogie =
                new GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // If program reaches here → finally executed
        assertTrue(true);
    }
}