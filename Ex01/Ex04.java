import java.lang.System;

public class Ex04 {
    public static void main(String args[]){
        int fib = 0;
        int fib1 = 1;
        int fib2 = 0;
        while (fib2<100){
            System.out.print(fib2 + " ");
            fib = fib1 + fib2;
            fib2 = fib1;
            fib1 = fib;
        }
    }
}
