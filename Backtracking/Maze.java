package Backtracking;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
       // path("", 9, 9);
    }

    static void path(String p , int r,int c){

        if(r==1 && c==1){
            System.out.println(p);
        }

        if(r>1){
            path(p+"D", r-1, c);
        }
        if(c>1){
            path(p+"R", r, c-1);
        }

    }

    static int count(int r,int c){

        if(r==1 || c==1){
            return 1;
        }
        int down = count(r-1, c);
        int left = count(r,c-1);

        return down + left;
    }
}
