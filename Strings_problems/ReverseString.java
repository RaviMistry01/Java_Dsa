package Strings_problems;

public class ReverseString {

   static char[] reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;


        while (first < last) {
            char temp = s[last];
            s[last] = s[first];
            s[first] = temp;
            first++;
            last--;
        }
        return s;
    }
    public static void main(String[] args) {
       char [] arr = {'H','E','L','L','O'};
       System.out.println( reverseString(arr));
        

        
    }

}
