import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    static Map<Long, Long> fiboMap = new HashMap<>(Map.of(0l,0l,1l,1l));
    public static long fibo1(long n) {
        if(n < 2) return n;
        return fibo1(n - 1) + fibo1(n - 2);
    }
    public static long fibo2(long n) {
        if(!fiboMap.containsKey(n)) fiboMap.put(n, fibo2(n - 1) + fibo2(n - 2));
        return fiboMap.get(n);
    }

    public static long fibo3(long n) {
        long last = 0;
        long next = 1;
        for (long i = 0; i < n; i++) {
            long oldLast = last;
            last = next;
            next = oldLast + next;
        }
        return last;
    }
}
