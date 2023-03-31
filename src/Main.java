import java.util.HashMap;
import java.util.Map;

public class Main {
    static long start;
    static long end;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 50;
        start = System.currentTimeMillis();
        System.out.println("result: " + Fibonacci.fibo1(i));
        end = System.currentTimeMillis();
        System.out.println("fibo1 take: " + (end - start) + " ms");
        System.out.println(start);
        System.out.println(end);

        start = System.currentTimeMillis();
        System.out.println("result: " + Fibonacci.fibo2(i));
        end = System.currentTimeMillis();
        System.out.println("fibo2 take: " + (end - start) + " ms");
        System.out.println(start);
        System.out.println(end);

        start = System.currentTimeMillis();
        System.out.println("result: " + Fibonacci.fibo3(i));
        end = System.currentTimeMillis();
        System.out.println("fibo3 take: " + (end - start) + " ms");
        System.out.println(start);
        System.out.println(end);
    }


}