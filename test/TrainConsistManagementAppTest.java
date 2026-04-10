import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    // Valid Capacity Test
    @Test
    void testException_ValidCapacityCreation()
            throws TrainConsistManagementApp.InvalidCapacityException {

        TrainConsistManagementApp.PassengerBogie bogie =
                new TrainConsistManagementApp.PassengerBogie(
                        "Sleeper",
                        72
                );

        assertNotNull(bogie);
    }

    // Negative Capacity Test
    @Test
    void testException_NegativeCapacityThrowsException() {

        Exception exception =
                assertThrows(
                        TrainConsistManagementApp.InvalidCapacityException.class,
                        () -> {
                            new TrainConsistManagementApp.PassengerBogie(
                                    "Sleeper",
                                    -10
                            );
                        }
                );

        assertEquals(
                "Capacity must be greater than zero",
                exception.getMessage()
        );
    }

    // Zero Capacity Test
    @Test
    void testException_ZeroCapacityThrowsException() {

        Exception exception =
                assertThrows(
                        TrainConsistManagementApp.InvalidCapacityException.class,
                        () -> {
                            new TrainConsistManagementApp.PassengerBogie(
                                    "AC",
                                    0
                            );
                        }
                );

        assertEquals(
                "Capacity must be greater than zero",
                exception.getMessage()
        );
    }

    // Exception Message Test
    @Test
    void testException_ExceptionMessageValidation() {

        Exception exception =
                assertThrows(
                        TrainConsistManagementApp.InvalidCapacityException.class,
                        () -> {
                            new TrainConsistManagementApp.PassengerBogie(
                                    "First Class",
                                    -5
                            );
                        }
                );

        assertEquals(
                "Capacity must be greater than zero",
                exception.getMessage()
        );
    }

    // Object Integrity Test
    @Test
    void testException_ObjectIntegrityAfterCreation()
            throws TrainConsistManagementApp.InvalidCapacityException {

        TrainConsistManagementApp.PassengerBogie bogie =
                new TrainConsistManagementApp.PassengerBogie(
                        "Sleeper",
                        72
                );

        assertEquals("Sleeper", bogie.getName());
        assertEquals(72, bogie.getCapacity());
    }

    // Multiple Valid Bogies
    @Test
    void testException_MultipleValidBogiesCreation()
            throws TrainConsistManagementApp.InvalidCapacityException {

        TrainConsistManagementApp.PassengerBogie b1 =
                new TrainConsistManagementApp.PassengerBogie(
                        "Sleeper",
                        72
                );

        TrainConsistManagementApp.PassengerBogie b2 =
                new TrainConsistManagementApp.PassengerBogie(
                        "AC",
                        56
                );

        assertNotNull(b1);
        assertNotNull(b2);
    }
}