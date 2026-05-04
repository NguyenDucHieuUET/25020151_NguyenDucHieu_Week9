package com.mathutils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BankAccountTest {
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }
    @Test
    void testPathOnMatrixStrategy() {
        BankAccount account = new BankAccount();
        String path = account.getStatementPath();
        // Test này sẽ gây lỗi trên hệ điều hành không phải Windows
        // Vì Linux/Mac sử dụng / và không coi \ là ký tự phân tách đường dẫn hợp lệ
        assertTrue(path.contains("\\"), "Lỗi: Đường dẫn không tuân thủ định dạng Windows!");
    }
}