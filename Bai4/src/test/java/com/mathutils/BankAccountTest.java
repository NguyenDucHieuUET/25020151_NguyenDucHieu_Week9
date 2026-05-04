package com.mathutils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;

public class BankAccountTest {
    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testFileCreationOnMultiOS() {
        BankAccount account = new BankAccount();
        String path = account.getStatementPath();

        // LOGIC GÂY LỖI:
        // Trên Windows: path chứa "\" và File.separator cũng là "\" -> PASS ✅
        // Trên Ubuntu/Mac: path chứa "\" nhưng File.separator là "/" -> FAIL ❌
        assertTrue(path.contains(File.separator),
                "Lỗi: Đường dẫn '" + path + "' không tương thích với separator '" + File.separator + "' của hệ điều hành này!");
    }
}