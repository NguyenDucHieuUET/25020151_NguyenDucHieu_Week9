package com.mathutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testFindMax() {
        Main m = new Main();
        assertEquals(30, m.findMax(new int[]{10, 25, 8, 30, 15}));
        assertEquals(-1, m.findMax(new int[]{}));
        assertEquals(-1, m.findMax(null));
    }
}