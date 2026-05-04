package com.mathutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathService {
    // // Tại sao dùng Logger thay vì System.out?
    // // Trả lời: Logger giúp quản lý log tập trung, phân cấp mức độ (INFO, ERROR) và dễ dàng ghi vào file.
    private static final Logger logger = LoggerFactory.getLogger(MathService.class);

    public int add(int a, int b) {
        // // Structured logging là gì?
        // // Trả lời: Là cách ghi log kèm tham số (dùng {}) giúp log tường minh và hiệu năng cao hơn cộng chuỗi.
        logger.info("Thực hiện cộng: {} + {}", a, b);
        return a + b;
    }
}