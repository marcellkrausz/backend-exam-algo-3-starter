package com.codecool;

public class Challenge {

    public static int minPositive(int a, int b) {
        if (a > 0 && a <= b || a > 0 && b <= 0) {
            return a;
        } else if (b > 0) {
            return b;
        } else {
            return -1;
        }
    }
}
