package ru.job4j.condition;

public class SqArea {

    public static double square(double p, double k) {
        return (p / (2 * (k + 1))) * (p / (2 * (k + 1))) * k;
            }

            public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
            }
}
