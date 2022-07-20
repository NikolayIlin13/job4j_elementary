package ru.job4j.condition;

public class Max {

    public static int maxOne(int left, int right) {
        return left > right ? left : right;
    }

    public static int maxTwo(int left, int right) {
        return left > right ? left : right;
    }

    public static int maxAll(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int result1 = Max.maxOne(8, 2);
        System.out.println(result1);
        int result2 = Max.maxTwo(2, 8);
        System.out.println(result2);
        int result3 = Max.maxAll(3, 3);
        System.out.println(result3);
    }
}
