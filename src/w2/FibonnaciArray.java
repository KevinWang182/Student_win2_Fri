package w2;

public class FibonnaciArray {

    public static void main(String[] args) {
        long[] fib = new long[100];
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i = 2; i < fib.length; i++)
            fib[i] = fib[i - 1] + fib[i - 2];
        
        for(long n: fib)
            System.out.println(n);
    }
    
}
