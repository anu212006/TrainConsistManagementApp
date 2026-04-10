import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    // testSort_BasicAlphabeticalSorting
    @Test
    void testSort_BasicAlphabeticalSorting() {

        String[] input = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        String[] expected = {
                "AC Chair",
                "First Class",
                "General",
                "Luxury",
                "Sleeper"
        };

        String[] result =
                TrainConsistManagementApp.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }

    // testSort_UnsortedInput
    @Test
    void testSort_UnsortedInput() {

        String[] input = {
                "Luxury",
                "General",
                "Sleeper",
                "AC Chair"
        };

        String[] expected = {
                "AC Chair",
                "General",
                "Luxury",
                "Sleeper"
        };

        String[] result =
                TrainConsistManagementApp.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }

    // testSort_AlreadySortedArray
    @Test
    void testSort_AlreadySortedArray() {

        String[] input = {
                "AC Chair",
                "First Class",
                "General"
        };

        String[] expected = {
                "AC Chair",
                "First Class",
                "General"
        };

        String[] result =
                TrainConsistManagementApp.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }

    // testSort_DuplicateBogieNames
    @Test
    void testSort_DuplicateBogieNames() {

        String[] input = {
                "Sleeper",
                "AC Chair",
                "Sleeper",
                "General"
        };

        String[] expected = {
                "AC Chair",
                "General",
                "Sleeper",
                "Sleeper"
        };

        String[] result =
                TrainConsistManagementApp.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }

    // testSort_SingleElementArray
    @Test
    void testSort_SingleElementArray() {

        String[] input = {
                "Sleeper"
        };

        String[] expected = {
                "Sleeper"
        };

        String[] result =
                TrainConsistManagementApp.sortBogieNames(input);

        assertArrayEquals(expected, result);
    }
}