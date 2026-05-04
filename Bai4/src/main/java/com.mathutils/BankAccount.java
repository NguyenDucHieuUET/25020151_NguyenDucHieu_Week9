package com.mathutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {
    private static final Logger logger = LoggerFactory.getLogger(BankAccount.class);
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            logger.warn("Cố gắng nạp số tiền không hợp lệ: {}", amount);
            return;
        }
        this.balance += amount;
        logger.info("Nạp tiền thành công. Số dư mới: {}", this.balance);
    }

    public double getBalance() {
        logger.debug("Truy xuất số dư tài khoản");
        return balance;
    }

    // --- PHẦN THÊM MỚI CHO BÀI 4 ---
    public String getStatementPath() {
        // Tái cấu trúc: Sử dụng File.separator để tự động thích nghi OS
        return "target" + java.io.File.separator +
                "statements" + java.io.File.separator +
                "account_report.pdf";
    }
}