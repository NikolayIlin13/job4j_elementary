package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(10.0, 10.0, 10.0);
        System.out.println(result);
        boolean result1 = Triangle.exist(20.0, 15.0, 35.0);
        System.out.println(result1);
    }
}
