import java.util.HashMap;
import java.util.Map;

public class Fibonachi {
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fibonachiFastCalc(int value) {
        if (value == 0) {
            return 0;
        } else if (value == 1) {
            return 1;
        }
        int previous = 1;
        int current = 1;

        for (int i = 2; i < value; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    public static int fibonachiCalcRecursive(int value) {
        if (value == 0) {
            return 0;
        } else if (value == 1) {
            return 1;
        }
        return fibonachiCalcRecursive(value - 1) + fibonachiCalcRecursive(value - 2);
    }

    public static int fibonachiCalcOptimised(int value) {
        if (value == 0) {
            return 0;
        } else if (value == 1) {
            return 1;
        }
        if (memo.containsKey(value)) {
            return memo.get(value);
        }
        int result = fibonachiCalcOptimised(value - 1) + fibonachiCalcOptimised(value - 2);
        memo.put(value, result);
        return result;
    }

    public static void main(String[] args) {
        int n = 10; // Example Fibonacci number position

        System.out.println("Fast Fibonacci at position " + n + ": " + fibonachiFastCalc(n));
        System.out.println("Recursive Fibonacci at position " + n + ": " + fibonachiCalcRecursive(n));
        System.out.println("Memoized Fibonacci at position " + n + ": " + fibonachiCalcOptimised(n));
    }
}
