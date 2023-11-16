package Leetcode.Day1;
//1980
//16-11-23

import java.util.Arrays;

public class FindUniqueBinaryString {
     public static String findDifferentBinaryString(String[] nums) {
        
        int n = nums.length;
        Arrays.sort(nums);
        int ptr = 0;

        for(int i=0 ; i<n ; i++){

            Long decVal = Long.parseLong(nums[i],2);

            if(decVal == ptr){
                ptr++;
            }
            else{
                return String.format("%"+n+"s",Long.toBinaryString(ptr)).replace(' ','0');
            }
        }

        return String.format("%"+n+"s",Long.toBinaryString(ptr)).replace(' ','0');

    }

    public static void main(String[] args) {
        String [] nums = {"111","011","001"};
        String ans = findDifferentBinaryString(nums);

        System.out.println(ans); //000
    }
}
