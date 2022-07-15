package ru.job4j.math;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return dif(first, second)
                + div(first, second);
    }

    public static double all(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + dif(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
        System.out.println(" result1: " + sumAndMultiply(10, 20));
        System.out.println(" result2: " + difAndDiv(100, 50));
        System.out.println(" result3: " + all(15, 15));
    }
}
