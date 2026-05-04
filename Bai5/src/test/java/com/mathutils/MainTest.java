package com.mathutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testCheckRank() {
        Main main = new Main();
        // Sửa dòng này: Không ghi "expected:", không ghi "score:"
        assertEquals("Pass", main.checkRank(85));
        assertEquals("Fail", main.checkRank(70));
    }
}