package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;
import org.junit.jupiter.api.Test;

public class CalculationsTest {
    @Test 
    void sumTest() {
    assertEquals(4, sum(2, 2));
}

    @Test
    void multiplyTest() {
        assertEquals(16, multiply(2, 8));
        assertEquals(18, multiply(2, 9));
    }

    @Test
    void divideTest() {
        assertEquals(0, divide(20,0));
    }

    @Test 
    void substractTest() {
        assertEquals(18, substract(28,10));
    }

    @Test
    void sumOfDigitsTest() {
        assertEquals(10, sumOfDigits(1234));
    }

    @Test 
    void maxDigitTest() {
        assertEquals(8, maxDigit(1234653248));
    }

    @Test
    void isDividedOnTest() { 
        assertEquals(false, isDividedOn(13,3));
    }
}