package org.example.schulung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTDDMediumTest {
    @Test
    public void reverseString_shouldReturnReverseString() {
        assertEquals("Java", ExerciseTDDMedium.reverseString("avaJ"));
        assertEquals("Hallo", ExerciseTDDMedium.reverseString("ollaH"));
    }

    @Test
    public void isPalindrome_shouldReturnTrue_whenPalindrome() {
        assertTrue(ExerciseTDDMedium.isPalindrome("Otto"));
    }

    @Test
    public void isPalindrome_shouldReturnFalse_whenNotPalindrome() {
        assertFalse(ExerciseTDDMedium.isPalindrome("Java"));
    }

    @Test
    public void countVowels_shouldReturnNumberOfVowels() {
        assertEquals(2, ExerciseTDDMedium.countVowels("Hallo"));
    }
}