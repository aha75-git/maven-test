package org.example.schulung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTDDBonusTest {
    @Test
    public void factorial_shouldReturnFactorial() {
        assertEquals(120, ExerciseTDDBonus.factorial(5));
    }

    @Test
    public void fibonacci_shouldReturnFactorial() {
        assertEquals(8, ExerciseTDDBonus.fibonacci(6));
    }

    @Test
    public void mergeArrays_shouldReturnMergedArrays() {
        int[] a = {1, 2};
        int[] b = { 3, 4};
        int[] expected = { 1, 2, 3, 4 };
        assertArrayEquals(expected, ExerciseTDDBonus.mergeArrays(a, b));
    }
}