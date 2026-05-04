package com.mathutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Kiểm thử hoạt động của BankAccount và xác minh Logging.
 */
public class BankAccountTest {

    @Test
    void testDepositSuccess() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        // Kiểm tra xem nạp 100 thì số dư có là 100 không
        assertEquals(100.0, account.getBalance(), "Số dư phải là 100 sau khi nạp");
    }

    @Test
    void testDepositInvalidAmount() {
        BankAccount account = new BankAccount();
        account.deposit(-50.0);
        // Nạp số âm thì số dư phải vẫn bằng 0 (để kích hoạt log.warn)
        assertEquals(0.0, account.getBalance());
    }
}