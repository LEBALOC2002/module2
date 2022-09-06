package PrimeNumber;

public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization o1 = new LazyPrimeFactorization("show prime lazy");
        OptimizedPrimeFactorization o2 = new OptimizedPrimeFactorization("Show prime Optimized");
        Thread show1 = new Thread(o1);
        Thread show2 = new Thread(o2);
        show1.start();
        show2.start();
    }
}
