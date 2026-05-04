package com.mathutils;

public class Main {
    // Cố ý viết sai quy tắc đặt tên để Checkstyle bắt lỗi: ví dụ "Check_Prime" (có dấu gạch dưới)
    public boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
        int so_SInh_vien=10;
    }
}