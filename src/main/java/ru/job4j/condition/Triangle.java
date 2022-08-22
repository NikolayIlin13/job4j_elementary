package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        if (ab + ac > bc && ac + bc > ab && ab + bc > ac) {
            System.out.println("треугольник существует");
            return true;
        } else {
            System.out.println("треугольник не существует");
            return false;
        }
    }

    public static void main(String[] args) {
        Triangle.exist(10.0, 10.0, 10.0);
        Triangle.exist(20.0, 15.0, 35.0);
    }
}
