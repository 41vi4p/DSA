import java.util.Arrays;

public class DPFibonacci {

    static long[] cache = new long[100];

    public static long fib(int n) {
        if (n <= 1) return n;

        // Check Cache
        if (cache[n] != -1) {
            System.out.println("Cache Hit for " + n);
            return cache[n];
        }

        System.out.println("Computing " + n + "...");
        cache[n] = fib(n - 1) + fib(n - 2);
        return cache[n];
    }

    public static void main(String[] args) {
        Arrays.fill(cache, -1);
        int n = 10;
        System.out.println("Fib(" + n + ") = " + fib(n));
    }
}
