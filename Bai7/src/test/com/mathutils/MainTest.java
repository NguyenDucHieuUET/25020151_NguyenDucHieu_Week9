package com.mathutils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void testIsPrime() {
        Main m = new Main();
        assertTrue(m.isPrime(7));
        assertFalse(m.isPrime(10));
    }
}