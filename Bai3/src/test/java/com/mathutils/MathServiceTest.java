package com.mathutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathServiceTest {
    @Test
    void testAdd() {
        MathService service = new MathService();
        assertEquals(2, service.add(1, 1), "1 + 1 phải bằng 2");
    }
}