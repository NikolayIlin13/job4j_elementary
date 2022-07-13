package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short heightMan = 180;
        double man = Fit.manWeight(heightMan);
        System.out.println(" Man 180 is " + man);
        short heightWoman = 170;
        double woman = Fit.womanWeight(heightWoman);
        System.out.println(" Woman 170 is " + woman);
    }

}
