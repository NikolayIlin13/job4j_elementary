package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class MaxTest {

    @Test
   public void whenMax8to2Then8() {
        int left = 8;
        int right = 2;
        int result = Max.maxOne(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when2to8Then8() {
        int left = 2;
        int right = 8;
        int result = Max.maxTwo(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void when3to3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.maxAll(left, right);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}