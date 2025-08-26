package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void isPositive_shouldReturnTrue_whenNumberIsPositive() {
        assertTrue(Main.isPositive(5));
    }

    @Test
    void multiply_shouldReturnProduct() {
        assertEquals(25, Main.multiply(5, 5));
    }

    @Test
    void getFirstLetter_shouldReturnFirstLetter() {
        assertEquals("A", Main.getFirstLetter("Anton"));
    }

    @Test
    void getFirstLetter_shouldReturnNull() {
        assertNull(Main.getFirstLetter(""));
        assertNull(Main.getFirstLetter(null));
    }

    @Test
    void getFirstLetter_shouldReturnNotNull() {
        assertNotNull(Main.getFirstLetter("test"));
    }

    @Test
    void divide_shouldThrowIllegalArgumentException_whenNumberOfTwoParamIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            Main.divide(10, 0);
        });
    }

    @Test
    void isPrime_shouldReturnTrue_whenNumberIsPrime() {
        // Teste Primzahlen
        assertTrue(Main.isPrime(2));
        assertTrue(Main.isPrime(3));
        assertTrue(Main.isPrime(5));
        assertTrue(Main.isPrime(13));
    }

    @Test
    void isPrime_shouldReturnFalse_whenNumberIsNotPrime() {
        // Teste Nicht-Primzahlen
        assertFalse(Main.isPrime(4));
        assertFalse(Main.isPrime(9));
        assertFalse(Main.isPrime(1));
        assertFalse(Main.isPrime(0));
        assertFalse(Main.isPrime(-5));
    }
}