package Recursion;

public class passing_num {
    
    public static void main(String[] args) {
        func(10);

    }

    static void func(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        func(--n);
    }
}
