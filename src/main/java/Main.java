import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    static long start;
    static long end;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int i = 20;
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

        System.out.println("*** Trivial compression ***");
        String gene = RandomStringUtils.random(Integer.MAX_VALUE / 3, 'A', 'C', 'G', 'T');
        System.out.println("*** Start compressing ***");
        start = System.currentTimeMillis();
        CompressGene compressGene = new CompressGene(gene);
        end = System.currentTimeMillis();
        System.out.println("*** Compress completed ***");
        System.out.println("Compress time: " + (end - start) + "ms");

        System.out.println("*** Start decompressing ***");
        start = System.currentTimeMillis();
        String decompress = compressGene.decompress();
        end = System.currentTimeMillis();
        System.out.println("*** Decompress completed ***");
        System.out.println("Decompress time: " + (end - start) + "ms");

        System.out.println(gene.equals(decompress));
    }


}