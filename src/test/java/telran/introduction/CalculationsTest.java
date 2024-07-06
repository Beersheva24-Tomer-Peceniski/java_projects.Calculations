package telran.introduction;

import static org.junit.jupiter.api.Assertions.*;
import static telran.introduction.Calculations.*;

import org.junit.jupiter.api.Test;

public class CalculationsTest {
@Test 
    void sumTest() {
// the first paramether is the expected result and the second is
// the class that you want to test       
assertEquals(4, sum(2, 2));
}
}
