package Collection_Frameworks.Arraylist;

import java.util.ArrayList;

public class arraylistpractice 
{

    public static void main(String[] args) {
        
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();


        l1.add(5);
        l1.add(5);
        l1.add(85);
        l1.add(5);
        l1.add(5);
        l2.add(99);
        l2.add(81);
        l1.addAll(l2);
       
        l1.size();
        l1.remove(5);

        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }

        
    }
    
}
