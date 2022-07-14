package ru.job4j;

public class Types {
    public static void main(String[] args) {
        System.out.println("PREOBRAZOVANIY S POTERYAMI");
        long l = 129;
        byte b = (byte) l;
        System.out.println("long-byte              " + b);
        float f = 12358.f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println("short=float+int        " + rsl);
        double d = 121.19;
        byte bb = (byte) d;
        System.out.println("double-byte             " + bb);
        System.out.println("PREOBRAZOVANIY BEZ POTER");
        char c = 45000;
        System.out.println("char-float            " + (float) c);
        short s = 1500;
        char cc = (char) s;
        System.out.println("short-char-double     " + (double) cc);
    }
}
