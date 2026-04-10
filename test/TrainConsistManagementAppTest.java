import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TrainConsistManagementAppTest {

    // Valid Train ID
    @Test
    void testRegex_ValidTrainID() {
        assertTrue(
                TrainConsistManagementApp.validateTrainID("TRN-1234")
        );
    }

    // Invalid Train ID Format
    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(
                TrainConsistManagementApp.validateTrainID("TRAIN12")
        );

        assertFalse(
                TrainConsistManagementApp.validateTrainID("TRN12A")
        );

        assertFalse(
                TrainConsistManagementApp.validateTrainID("1234-TRN")
        );
    }

    // Valid Cargo Code
    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(
                TrainConsistManagementApp.validateCargoCode("PET-AB")
        );
    }

    // Invalid Cargo Code
    @Test
    void testRegex_InvalidCargoCodeFormat() {

        assertFalse(
                TrainConsistManagementApp.validateCargoCode("PET-ab")
        );

        assertFalse(
                TrainConsistManagementApp.validateCargoCode("PET123")
        );

        assertFalse(
                TrainConsistManagementApp.validateCargoCode("AB-PET")
        );
    }

    // Train ID Digit Length Validation
    @Test
    void testRegex_TrainIDDigitLengthValidation() {

        assertFalse(
                TrainConsistManagementApp.validateTrainID("TRN-123")
        );

        assertFalse(
                TrainConsistManagementApp.validateTrainID("TRN-12345")
        );
    }

    // Cargo Code Uppercase Validation
    @Test
    void testRegex_CargoCodeUppercaseValidation() {

        assertFalse(
                TrainConsistManagementApp.validateCargoCode("PET-Ab")
        );

        assertFalse(
                TrainConsistManagementApp.validateCargoCode("PET-aB")
        );
    }

    // Empty Input Handling
    @Test
    void testRegex_EmptyInputHandling() {

        assertFalse(
                TrainConsistManagementApp.validateTrainID("")
        );

        assertFalse(
                TrainConsistManagementApp.validateCargoCode("")
        );
    }

    // Exact Pattern Match
    @Test
    void testRegex_ExactPatternMatch() {

        assertFalse(
                TrainConsistManagementApp.validateTrainID("TRN-1234X")
        );

        assertFalse(
                TrainConsistManagementApp.validateCargoCode("PET-ABC")
        );
    }
}