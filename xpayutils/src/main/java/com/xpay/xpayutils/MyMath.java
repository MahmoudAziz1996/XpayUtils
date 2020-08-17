package com.xpay.xpayutils;

public class MyMath {
    public static int plus(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static float div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divide By Zero");
        } else {
            return a / b;
        }
    }

    public static int mod(int a, int b) {
        return a % b;
    }

    public static int pow(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static int mul(int a, int b) {
        return a * b;
    }

}
