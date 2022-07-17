package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

class MaxTest {

    @Test
   public void whenMax8to2Then8() {
        int left = 8;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}