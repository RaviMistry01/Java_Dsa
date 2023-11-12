package Recursion;

import java.util.ArrayList;

public class find_all_elements {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,3,4,5,6};
        System.out.println(findall(arr, 3, 0,new ArrayList<>()));
        
    }

    static ArrayList<Integer> findall(int []arr , int target ,int index, ArrayList<Integer> list){

        if(index == arr.length-1){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        return findall(arr, target, index+1, list);
    }
}
