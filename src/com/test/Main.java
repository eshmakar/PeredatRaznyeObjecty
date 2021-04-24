package com.test;

public class Main {
    static void printArrays(Object... args) {
        for (Object x : args) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArrays(456, 546, "weoif", true, false, new Integer[]{45, 5, 6, 25});
    }
}

//OUTPUT
//456 546 weoif true false [Ljava.lang.Integer;@6d03e736