import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        Calculator calculator = new Calculator();
    }

    @Test
    void calculatorTest() {
        assertEquals(2, calculator.divide(10, 2));


    }




}