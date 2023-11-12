package Collection_Frameworks.Arraylist;

import java.util.ArrayList;

public class convert_to_array {
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>();
        al.add("ravi1");
        al.add("ravi2");
        al.add("ravi3");
        al.add("ravi4");

        //Create an array

        String [] arr = new String [al.size()];

        al.toArray(arr);

        for(int i = 0;i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }


}
