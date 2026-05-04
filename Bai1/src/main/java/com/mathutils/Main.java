package com.mathutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    // // Khởi tạo Logger cho lớp Main
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // 1. Kiểm tra Logging (Thay thế System.out.println)
        // // Tại sao dùng log.info thay vì sout?
        // // Trả lời: Để ghi lại sự kiện có mốc thời gian và mức độ quan trọng.
        logger.info("Chương trình MathUtils đang khởi động...");

        MathService service = new MathService();
        int sum = service.add(10, 20);

        logger.info("Kết quả phép tính: {}", sum);

        // 2. Kiểm tra Hibernate (Nhu cầu lưu trữ trong tương lai)
        try {
            // // Configuration() dùng để làm gì?
            // // Trả lời: Để đọc tệp cấu hình (hibernate.cfg.xml) và chuẩn bị môi trường kết nối DB.
            Configuration cfg = new Configuration().configure();
            logger.info("Cấu hình Hibernate thành công!");

            // Đoạn này để kiểm tra xem thư viện đã nhận diện đúng chưa
            // (Nếu chưa có file xml cấu hình DB, đoạn này sẽ báo lỗi nhưng chứng minh thư viện đã chạy)
        } catch (Exception e) {
            logger.warn("Hibernate đã nạp nhưng chưa có cấu hình database: " + e.getMessage());
        }

        logger.info("Chương trình kết thúc.");
    }
}