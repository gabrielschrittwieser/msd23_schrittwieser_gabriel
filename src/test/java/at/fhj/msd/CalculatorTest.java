package at.fhj.msd;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Class for the four arithmetic operations of the Calculator Class.
 */
public class CalculatorTest {

    // ------ Tests for Addition ------
    @DisplayName("Adding positive numbers")
    @Test
    void addNumsPositive() {
        assertEquals(8, Calculator.addNums(3, 5));
        assertEquals(10, Calculator.addNums(0, 10));
        assertEquals(12, Calculator.addNums(6, 6));
    }

    @DisplayName("Adding negative numbers")
    @Test
    void addNumsNegative() {
        assertEquals(-5, Calculator.addNums(-10, 5));
        assertEquals(-10, Calculator.addNums(0, -10));
        assertEquals(-76, Calculator.addNums(127, -203));
    }

    @DisplayName("Adding decimal numbers")
    @Test
    void addNumsDecimals() {
        assertEquals(5.5, Calculator.addNums(1.75, 3.75));
        assertEquals(2.25, Calculator.addNums(1, 1.25));
        assertEquals(-8.75, Calculator.addNums(4, -12.75));
    }

    // ------ Tests for Subtraction ------
    @DisplayName("Subtracting positive numbers")
    @Test
    void subtractPositive() {
        assertEquals(8, Calculator.subtractNums(10, 2));
        assertEquals(0, Calculator.subtractNums(144, 144));
        assertEquals(60, Calculator.subtractNums(80, 20));
    }

    @DisplayName("Subtracting negative numbers")
    @Test
    void subtractNegative() {
        assertEquals(0, Calculator.subtractNums(-10, -10));
        assertEquals(-144, Calculator.subtractNums(-288, -144));
        assertEquals(-60, Calculator.subtractNums(-80, -20));
    }

    @DisplayName("Subtracting decimal numbers")
    @Test
    void subtractDecimals() {
        assertEquals(12.5, Calculator.subtractNums(13, 0.5));
        assertEquals(3.25, Calculator.subtractNums(-4, -7.25));
        assertEquals(6.8, Calculator.subtractNums(12, 5.2));
    }

    // ------ Tests for Multiplication ------
    @DisplayName("Multiply positive numbers")
    @Test
    void multiplyPositive() {
        assertEquals(24, Calculator.multiplyNums(8, 3));
        assertEquals(12, Calculator.multiplyNums(6, 2));
        assertEquals(145, Calculator.multiplyNums(29, 5));
    }

    @DisplayName("Multiply negative numbers")
    @Test
    void multiplyNegative() {
        assertEquals(24, Calculator.multiplyNums(-8, -3));
        assertEquals(-12, Calculator.multiplyNums(6, -2));
        assertEquals(145, Calculator.multiplyNums(-29, -5));
    }

    @DisplayName("Multiply decimal numbers")
    @Test
    void multiplyDecimals() {
        assertEquals(12.6, Calculator.multiplyNums(6.3, 2));
        assertEquals(6.8, Calculator.multiplyNums(2, 3.4));
        assertEquals(570.4, Calculator.multiplyNums(142.6, 4));
    }

    // ------ Tests for Division ------
    @DisplayName("Divide positive numbers")
    @Test
    void dividePositive() {
        assertEquals(1, Calculator.divideNums(4, 4));
        assertEquals(6.25, Calculator.divideNums(25, 4));
        assertEquals(11, Calculator.divideNums(77, 7));
    }

    @DisplayName("Divide negative numbers")
    @Test
    void divideNegative() {
        assertEquals(1, Calculator.divideNums(-4, -4));
        assertEquals(-6.25, Calculator.divideNums(25, -4));
        assertEquals(11, Calculator.divideNums(-77, -7));
    }

    @DisplayName("Divide decimal numbers")
    @Test
    void divideDecimals() {
        assertEquals(1.0, Calculator.divideNums(4.0, 4.0));
        assertEquals(33.15, Calculator.divideNums(66.3, 2));
        assertEquals(22.375, Calculator.divideNums(89.5, 4));
    }

    @DisplayName("Divide by zero")
    @Test
    void divideZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divideNums(10, 0));
        assertThrows(ArithmeticException.class, () -> Calculator.divideNums(0, 0));
    }
    // ------ Tests for Factorial ------
    @DisplayName("Factorial with positive Integer")
    @Test
    void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
    }
    @DisplayName("Factorial with zero")
    @Test
    void testFactorialZero() {
        assertEquals(1, Calculator.factorial(0));
    }
    @DisplayName("Factorial with negative Integer")
    @Test
    void testFactorialNegative() {
        assertEquals(0, Calculator.factorial(-5));
    }
}