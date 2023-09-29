package array_problems;

public class SecondMax {

    static int findSecondMax(int [] arr){
        int max = Integer.MIN_VALUE;
        int SecondMax = Integer.MIN_VALUE;

        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]>max){
                SecondMax = max;
                max = arr[i];
            }
            else if(arr[i] > SecondMax && arr[i]!=max){
                SecondMax = arr[i];
            }
        }

        return SecondMax;

    }

    
    public static void main(String[] args) {
        
        int [] arr = {-1000,5,372,95,36,21};

        int result = findSecondMax(arr);
        System.out.println(result);
   
      
        
    }
}
