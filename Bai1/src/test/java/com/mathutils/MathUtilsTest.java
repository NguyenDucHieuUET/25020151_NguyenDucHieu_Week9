package com.mathutils;

import org.junit.jupiter.api.Test; // // Tại sao dùng Jupiter? Trả lời: Đây là API mới của JUnit 5.
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * File test để xác minh JUnit 5 đã được cấu hình đúng.
 */
public class MathUtilsTest {

    @Test
    void testAdd() {
        MathService service = new MathService();
        int result = service.add(10, 5);

        // // assertEquals dùng để làm gì?
        // // Trả lời: So sánh kết quả thực tế và mong đợi để xác nhận logic đúng.
        assertEquals(15, result, "10 + 5 phải bằng 15");
    }
}