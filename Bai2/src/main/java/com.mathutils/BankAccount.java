package com.mathutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Lớp quản lý tài khoản ngân hàng tuân thủ Google Style.
 */
public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            // // Tại sao dùng WARN?
            // // Trả lời: Dùng cho các tình huống bất thường nhưng không làm sập hệ thống.
            logger.warn("Cố gắng nạp số tiền không hợp lệ: {}", amount);
            return;
        }

        this.balance += amount;

        // // Tại sao dùng INFO?
        // // Trả lời: Để ghi lại các sự kiện quan trọng trong quy trình nghiệp vụ (Business Flow).
        logger.info("Nạp tiền thành công. Số dư mới: {}", this.balance);
    }

    public double getBalance() {
        // // Tại sao dùng DEBUG?
        // // Trả lời: Dùng để theo dõi chi tiết luồng chạy, thường chỉ bật khi cần tìm lỗi (troubleshooting).
        logger.debug("Truy xuất số dư tài khoản");
        return balance;
    }
}