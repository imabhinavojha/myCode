package org.Kunal.Recussion;
public class Fibonacci {
    public static void main(String[] args) {
        int fib = fibonacci(4);
        System.out.println(fib);
        
    }
    //Find nth Fibonacci
    // 0 1 1 2 3 5 8 12
    static int fibonacci(int num){
        if(num < 2){
            return num;
        }
        
        return fibonacci(num-1) + fibonacci(num-2);

    }
    
}
