import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementAppTest {

    // testSort_BasicSorting
    @Test
    void testSort_BasicSorting() {

        int[] input = {72, 56, 24, 70, 60};
        int[] expected = {24, 56, 60, 70, 72};

        int[] result =
                TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, result);
    }

    // testSort_AlreadySortedArray
    @Test
    void testSort_AlreadySortedArray() {

        int[] input = {24, 56, 60, 70, 72};
        int[] expected = {24, 56, 60, 70, 72};

        int[] result =
                TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, result);
    }

    // testSort_DuplicateValues
    @Test
    void testSort_DuplicateValues() {

        int[] input = {72, 56, 56, 24};
        int[] expected = {24, 56, 56, 72};

        int[] result =
                TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, result);
    }

    // testSort_SingleElementArray
    @Test
    void testSort_SingleElementArray() {

        int[] input = {50};
        int[] expected = {50};

        int[] result =
                TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, result);
    }

    // testSort_AllEqualValues
    @Test
    void testSort_AllEqualValues() {

        int[] input = {40, 40, 40};
        int[] expected = {40, 40, 40};

        int[] result =
                TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, result);
    }
}