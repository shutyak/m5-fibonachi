import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FibonachiTest {

    @Test
    public void testFibonacciZero() {
        int result = Fibonachi.fibonachiFastCalc(0);
        assertEquals(0, result);
    }

    @Test
    public void testFibonacciOne() {
        int result = Fibonachi.fibonachiFastCalc(1);
        assertEquals(1, result);
    }

    @Test
    public void testFibonacciSmall() {
        int result = Fibonachi.fibonachiFastCalc(6);
        assertEquals(8, result); // 0, 1, 1, 2, 3, 5, 8
    }

    @Test
    public void testFibonacciLarge() {
        int result = Fibonachi.fibonachiFastCalc(10);
        assertEquals(55, result); // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    }

    @Test
    void fibonachiCalcOpimisedTest() {
        // Test case 1: Fibonacci of 0 should be 0
        assertEquals(0, Fibonachi.fibonachiCalcOptimised(0));

        // Test case 2: Fibonacci of 1 should be 1
        assertEquals(1, Fibonachi.fibonachiCalcOptimised(1));

        // Test case 3: Fibonacci of 5 should be 5
        assertEquals(5, Fibonachi.fibonachiCalcOptimised(5));

        // Test case 4: Fibonacci of 10 should be 55
        assertEquals(55, Fibonachi.fibonachiCalcOptimised(10));

        // You can add more test cases as needed
    }
    @Test
    void testFibonacciCalcRecursive() {
        assertEquals(0, Fibonachi.fibonachiCalcRecursive(0));
        assertEquals(1, Fibonachi.fibonachiCalcRecursive(1));
        assertEquals(5, Fibonachi.fibonachiCalcRecursive(5));
        assertEquals(55, Fibonachi.fibonachiCalcRecursive(10));
        // You can add more test cases as needed
    }

}


