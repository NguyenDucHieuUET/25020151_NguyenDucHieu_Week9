package com.mathutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testCheckRank() {
        Main main = new Main();

        // Test case cho trường hợp Pass
        assertEquals("Pass", main.checkRank(85));

        // Test case cho trường hợp Fail
        assertEquals("Fail", main.checkRank(70));
    }
}