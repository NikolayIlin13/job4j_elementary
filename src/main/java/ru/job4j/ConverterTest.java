package ru.job4j;

public class ConverterTest {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = ConverterTest.rubleToEuro(140);
        float dollar = ConverterTest.rubleToDollar(120);
        System.out.println(" 140 rubles are " + euro + " euro. ");
        float in = 140;
        float expectedEUR = 2;
        float outRTE = ConverterTest.rubleToEuro(in);
        boolean passedE = expectedEUR == outRTE;
        System.out.println(" 140 rubles are 2. Test result :" + passedE);
        System.out.println(" 120 rubles are " + dollar + " dollar. ");
        float inRub = 120;
        float expectedDol = 2;
        float outRTD = ConverterTest.rubleToDollar(inRub);
        boolean passedD = expectedDol == outRTD;
        System.out.println(" 120 rubles are 2. Test result :" + passedD);
    }
}

