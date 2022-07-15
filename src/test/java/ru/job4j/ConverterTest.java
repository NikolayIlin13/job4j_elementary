package ru.job4j;

import  org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dollar() {
        float inRub = 120;
        float expectedDol = 2;
        float outRTD = Converter.rubleToDollar(inRub);
        float epsD = 0.0001f;
        Assert.assertEquals(expectedDol, outRTD, epsD);
    }
}