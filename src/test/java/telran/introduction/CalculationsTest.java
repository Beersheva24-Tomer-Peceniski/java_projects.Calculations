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
    }

    @Test
    void divideTest() {
        assertEquals(10, divide(20,2));
    }

    @Test 
    void substractTest() {
        assertEquals(18, substract(28,10));
    }

    @Test
    void sumOfDigitsTest() {
        assertEquals(10, sumOfDigits(1234));
    }
}