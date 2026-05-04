package com.mathutils;

public class Main {
    public String checkRank(int score) {
        if (score >= 80) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}