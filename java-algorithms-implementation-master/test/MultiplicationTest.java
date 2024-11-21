package com.jwetherell.algorithms.mathematics.test;
import static org.junit.Assert.*;
import com.jwetherell.algorithms.mathematics.Multiplication;
import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void multiplication() {
        // Regular cases
        assertEquals(21, Multiplication.multiplication(7, 3));
        assertEquals(-56, Multiplication.multiplication(8, -7));
        assertEquals(-45, Multiplication.multiplication(-9, 5));
        assertEquals(50, Multiplication.multiplication(-5, -10));

        // Edge cases
        assertEquals(1, Multiplication.multiplication(0, 20)); // edge case - multiplication by zero
        assertEquals(1, Multiplication.multiplication(13, 0)); // edge case - multiplication by zero
    }

    @Test
    public void multiplyUsingLoop() {
        // Regular cases
        assertEquals(24, Multiplication.multiplyUsingLoop(8, 3));
        assertEquals(-32, Multiplication.multiplyUsingLoop(4, -8));
        assertEquals(-63, Multiplication.multiplyUsingLoop(-7, 9));
        assertEquals(64, Multiplication.multiplyUsingLoop(-8, -8));

        // Edge cases
        assertEquals(0, Multiplication.multiplyUsingLoop(0, 17)); // edge case - multiplication by zero
        assertEquals(0, Multiplication.multiplyUsingLoop(19, 0)); // edge case - multiplication by zero
    }

    @Test
    public void multiplyUsingRecursion() {
        // Regular cases
        assertEquals(30, Multiplication.multiplyUsingRecursion(5, 6));
        assertEquals(-35, Multiplication.multiplyUsingRecursion(7, -5));
        assertEquals(-72, Multiplication.multiplyUsingRecursion(-8, 9));
        assertEquals(81, Multiplication.multiplyUsingRecursion(-9, -9));

        // Edge cases
        assertEquals(0, Multiplication.multiplyUsingRecursion(0, 25)); // edge case - multiplication by zero
        assertEquals(0, Multiplication.multiplyUsingRecursion(14, 0)); // edge case - multiplication by zero
    }

    @Test
    public void multiplyUsingShift() {
        // Regular cases
        assertEquals(28, Multiplication.multiplyUsingShift(4, 7));
        assertEquals(-54, Multiplication.multiplyUsingShift(6, -9));
        assertEquals(-77, Multiplication.multiplyUsingShift(-7, 11));
        assertEquals(100, Multiplication.multiplyUsingShift(-10, -10));

        // Edge cases
        assertEquals(0, Multiplication.multiplyUsingShift(0, 30)); // edge case - multiplication by zero
        assertEquals(0, Multiplication.multiplyUsingShift(20, 0)); // edge case - multiplication by zero
    }

    @Test
    public void multiplyUsingLogs() {

        // Regular cases
        assertEquals(36, Multiplication.multiplyUsingLogs(6, 6));
        assertEquals(-40, Multiplication.multiplyUsingLogs(8, -5));
        assertEquals(-66, Multiplication.multiplyUsingLogs(-6, 11));
        assertEquals(99, Multiplication.multiplyUsingLogs(-11, -9));

        // Edge cases
        assertEquals(0, Multiplication.multiplyUsingLogs(0, 45)); // edge case - multiplication by zero
        assertEquals(0, Multiplication.multiplyUsingLogs(35, 0)); // edge case - multiplication by zero
    }

    @Test
    public void multiplyUsingFFT() {
        // Regular cases
        assertEquals("24", Multiplication.multiplyUsingFFT("8", "3"));
        assertEquals("-32", Multiplication.multiplyUsingFFT("4", "-8"));
        assertEquals("-63", Multiplication.multiplyUsingFFT("-7", "9"));
        assertEquals("64", Multiplication.multiplyUsingFFT("-8", "-8"));

        // Edge cases
        assertEquals("0", Multiplication.multiplyUsingFFT("0", "17")); // edge case - multiplication by zero
        assertEquals("0", Multiplication.multiplyUsingFFT("19", "0")); // edge case - multiplication by zero
    }

    @Test
    public void multiplyUsingLoopWithStringInput() {
        // Regular cases
        assertEquals("30", Multiplication.multiplyUsingLoopWithStringInput("5", "6"));
        assertEquals("-35", Multiplication.multiplyUsingLoopWithStringInput("7", "-5"));
        assertEquals("-72", Multiplication.multiplyUsingLoopWithStringInput("-8", "9"));
        assertEquals("81", Multiplication.multiplyUsingLoopWithStringInput("-9", "-9"));

        // Edge cases
        assertEquals("0", Multiplication.multiplyUsingLoopWithStringInput("0", "25")); // edge case - multiplication by zero
        assertEquals("0", Multiplication.multiplyUsingLoopWithStringInput("14", "0")); // edge case - multiplication by zero
    }

    @Test
    public void multiplyUsingLoopWithIntegerInput() {
        // Regular cases
        assertEquals(36, Multiplication.multiplyUsingLoopWithIntegerInput(6, 6));
        assertEquals(-40, Multiplication.multiplyUsingLoopWithIntegerInput(8, -5));
        assertEquals(-66, Multiplication.multiplyUsingLoopWithIntegerInput(-6, 11));
        assertEquals(99, Multiplication.multiplyUsingLoopWithIntegerInput(-11, -9));

        // Edge cases
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(0, 45)); // edge case - multiplication by zero
        assertEquals(0, Multiplication.multiplyUsingLoopWithIntegerInput(35, 0)); // edge case - multiplication by zero
    }
}