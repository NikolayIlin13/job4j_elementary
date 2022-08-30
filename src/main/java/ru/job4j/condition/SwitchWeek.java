package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name;
        switch (day) {
            case 1:
                name = "понедельник";
                break;
            case 2:
                name = "вторник";
                break;
            case 3:
                name = "среда";
                break;
            case 4:
                name = "четверг";
                break;
            case 5:
                name = "пятница";
                break;
            case 6:
                name = "субБота";
            default:
                name = "Ошибка";
                break;
        }
        return name;
    }

    public static void main(String[] args) {
        String name = SwitchWeek.nameOfDay(1);
        System.out.println(name);
        String name2 = SwitchWeek.nameOfDay(2);
        System.out.println(name2);
        String name8 = SwitchWeek.nameOfDay(8);
        System.out.println(name8);
    }
}