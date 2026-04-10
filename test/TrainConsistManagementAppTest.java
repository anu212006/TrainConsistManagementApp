import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TrainSearchUC20Test {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {

        String[] data = {};

        assertThrows(
                IllegalStateException.class,
                () -> TrainSearchUC20.searchBogie(data, "BG101")
        );
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {

        String[] data = {"BG101", "BG205"};

        assertDoesNotThrow(
                () -> TrainSearchUC20.searchBogie(data, "BG101")
        );
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {

        String[] data = {"BG101","BG205","BG309"};

        assertTrue(
                TrainSearchUC20.searchBogie(data, "BG205")
        );
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {

        String[] data = {"BG101","BG205","BG309"};

        assertFalse(
                TrainSearchUC20.searchBogie(data, "BG999")
        );
    }

    @Test
    void testSearch_SingleElementValidCase() {

        String[] data = {"BG101"};

        assertTrue(
                TrainSearchUC20.searchBogie(data, "BG101")
        );
    }
}