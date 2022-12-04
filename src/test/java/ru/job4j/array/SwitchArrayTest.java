package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap6to0() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {6, 2, 3, 4, 5, 1};
        assertThat(result).containsExactly(expected);
        }

        @Test
        public void whenSwap2to6() {
                int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                int source = 2;
                int dest = 6;
                int[] result = SwitchArray.swap(input, source, dest);
                int[] expected = {1, 2, 7, 4, 5, 6, 3, 8, 9};
                assertThat(result).containsExactly(expected);
    }
}