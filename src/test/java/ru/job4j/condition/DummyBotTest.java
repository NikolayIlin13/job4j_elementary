package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class DummyBotTest {

    @Test
   public void whenGreetBot() {
        String in = "Привет, бот.";
        String result = DummyBot.answer(in);
        String expected = "Привет, умник.";
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenByeBot() {
        String in = "Пока.";
        String result = DummyBot.answer(in);
        String expected = "До скорой встречи.";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenUknownBot() {
        String in = "сколько будет 2+ 2?";
        String result = DummyBot.answer(in);
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        Assert.assertEquals(expected, result);
    }
}