package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        short inM = 180;
        double expectedM = 92;
        double outM = Fit.manWeight(inM);
        Assert.assertEquals(expectedM, outM, 0.01);
    }

    @Test
    public void womanWeight() {
        short inW = 170;
        double expectedW = 69;
        double out = Fit.womanWeight(inW);
        Assert.assertEquals(expectedW, out, 0.01);
    }
}