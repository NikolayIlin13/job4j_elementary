package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        float rls = value / 70;
        return rls;
    }

    public static float rubleToDollar(float value) {
        float rls = value / 60;
        return rls;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(120);
        System.out.println(" 140 rubles are " + euro + " euro. ");
        System.out.println("120 rubles are " + dollar + " dollar. ");
    }
}
