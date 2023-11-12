package Recursion;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fibno(10));

    }

    static int fibno(int n){
        if(n<2){
         return 1;
        }

        return fibno(n-1) + fibno(n-2);
    }
}
