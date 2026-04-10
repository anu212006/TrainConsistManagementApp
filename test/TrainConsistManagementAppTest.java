package com.train.uc18;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UC18_LinearSearchBogieTest {

    String[] bogieIds = {
            "BG101",
            "BG205",
            "BG309",
            "BG412",
            "BG550"
    };

    // Test 1
    @Test
    void testSearch_BogieFound() {

        boolean result =
                com.train.uc18.UC18_LinearSearchBogie.searchBogie(
                        bogieIds,
                        "BG309"
                );

        assertTrue(result);
    }

    // Test 2
    @Test
    void testSearch_BogieNotFound() {

        boolean result =
                com.train.uc18.UC18_LinearSearchBogie.searchBogie(
                        bogieIds,
                        "BG999"
                );

        assertFalse(result);
    }

    // Test 3
    @Test
    void testSearch_FirstElementMatch() {

        boolean result =
                com.train.uc18.UC18_LinearSearchBogie.searchBogie(
                        bogieIds,
                        "BG101"
                );

        assertTrue(result);
    }

    // Test 4
    @Test
    void testSearch_LastElementMatch() {

        boolean result =
                com.train.uc18.UC18_LinearSearchBogie.searchBogie(
                        bogieIds,
                        "BG550"
                );

        assertTrue(result);
    }

    // Test 5
    @Test
    void testSearch_SingleElementArray() {

        String[] single = {"BG101"};

        boolean result =
                com.train.uc18.UC18_LinearSearchBogie.searchBogie(
                        single,
                        "BG101"
                );

        assertTrue(result);
    }
}