package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expented = 40;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expented, rsl);
    }

    @Test
    public void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expented = 3;
        int rsl1 = X2.calc(a, b, c, x);
        Assert.assertEquals(expented, rsl1);
    }

    @Test
    public void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expented = 2;
        int rsl2 = X2.calc(a, b, c, x);
        Assert.assertEquals(expented, rsl2);
    }

    @Test
    public void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expented = 2;
        int rsl3 = X2.calc(a, b, c, x);
        Assert.assertEquals(expented, rsl3);
    }

    @Test
    public void whenA1B1C1X0Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expented = 1;
        int rsl4 = X2.calc(a, b, c, x);
        Assert.assertEquals(expented, rsl4);
    }
}