package array_problems;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {


    public static void inputArray(int [] arr , Scanner scanner){

        for(int i = 0 ; i<arr.length ; i++){
            arr[i] = scanner.nextInt();
        }
        // for(int nums : arr){
        //     System.out.print(nums + " ");
        // }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int [] arr = new int[5];

        inputArray(arr, scanner);



        

        scanner.close();
    }



}
