package com.mathutils;

public class Main {
    /**
     * Bài 6: Tìm số lớn nhất trong mảng để minh họa tối ưu hóa CI/CD
     */
    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        Main app = new Main();
        int[] data = {10, 25, 8, 30, 15};
        System.out.println("Max value: " + app.findMax(data));
        System.out.println("Checking cache performance..."); // Thêm dòng này
    }
}
//lan1:32s
//lan2:29s