package test;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit Test class for testing methods of Calculator class.
 */
public class CalculatorTest {

        @Test
        public void testAdd() {
                main.Calculator calc = new main.Calculator();
                assertEquals(60, calc.add(10,20,30));
        }

        @Test
        public void testMultiply() {
                main.Calculator calc = new main.Calculator();
                assertEquals(6000, calc.multiply(10,20,30));
        }

}

