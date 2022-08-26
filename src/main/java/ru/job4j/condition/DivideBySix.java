package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "Исходное число делится на 6.";
        } else if (number % 3 == 0) {
            rsl = "Исходное число делится на 3, но не является четным.";
        } else if (number % 2 == 0) {
            rsl = "Исходное число не делится на 3, но является четным.";
        } else {
            rsl = "Исходное число не делится на 3 и не является четным.";
        }
        return rsl;
    }

    public static void main(String[] args) {
       String rsl24 = DivideBySix.checkNumber(24);
       System.out.println(rsl24);
       String rsl9 = DivideBySix.checkNumber(9);
       System.out.println(rsl9);
       String rsl14 = DivideBySix.checkNumber(14);
       System.out.println(rsl14);
       String rsl25 = DivideBySix.checkNumber(25);
       System.out.println(rsl25);
    }
}