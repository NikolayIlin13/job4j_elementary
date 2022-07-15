package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
        double result1 = SqArea.square(9, 5);
        System.out.println(" p = 9, k = 5, s = 3,79 real = " + result1);
        double result2 = SqArea.square(12, 4);
        System.out.println(" p = 12, k = 4, s = 5,76 real = " + result2);
    }
}
