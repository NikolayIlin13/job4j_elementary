package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP9K5Square3dot79() {
        float expected1 = 2.81f;
        int p1 = 9;
        double k1 = 5;
        double out1 = SqArea.square(p1, k1);
        Assert.assertEquals(expected1, out1, 0.01);
    }

    @Test
    public void whenP12K4Square5dot76() {
        float expected2 = 5.76f;
        int p2 = 12;
        double k2 = 4;
        double out2 = SqArea.square(p2, k2);
        Assert.assertEquals(expected2, out2, 0.01);
    }
}