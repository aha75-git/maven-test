package org.example.schulung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTDDTest {
    @Test
    public void sum_shouldReturnSumOfTwoNumbers() {
        assertEquals(3, ExerciseTDD.sum(1, 2));
    }

    @Test
    public void isEven_shouldReturnTrue_whenNumberIsEven() {
        assertTrue(ExerciseTDD.isEven(6));
    }

    @Test
    public void isEven_shouldReturnFalse_whenNumberIsNotEven() {
        assertFalse(ExerciseTDD.isEven(5));
    }

    @Test
    public void getFirstCharacter_shouldReturnFirstCharacter() {
        assertEquals("H", ExerciseTDD.getFirstCharacter("Hallo"));
    }
}