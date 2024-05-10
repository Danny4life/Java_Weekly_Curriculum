package week_3.class_activity_7A;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {


    @Test
    void addTwoPlusTwoShouldBeFour() {
        SimpleCalculator calculator = new SimpleCalculator();

        int actual = calculator.add(2,2);
        assertEquals(4, actual);

        /**
         * using assert true in the case has is edge case, in that if we change our method to multiplication, it will pass, but
         * in this case that is not what we want
         */
        //assertTrue(actual == 4);
        //assertNotEquals();

    }

    @Test
    void isShouldPrintHelloWorld() {
        SimpleCalculator cals = new SimpleCalculator();

     //   String actual = cals.hello();
        String expected = "Hello World";

       // assertEquals(expected, actual);


    }
}