package Searching_and_Sorting.Sorting;

public class BubbleSort {
    
    static void bubbleSort(int [] arr ,int size ){

        
        int i,j,temp;
        boolean swapped = false;

        for(i = 0;i<size-1;i++){

            for(j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                    
                    
                }
            }

            if(swapped == false) break;
        }

       


    }

    static void  printArray(int [] arr ,int size){

        for(int i = 0 ;i<size;i++){

            System.out.print(arr[i]+" ");
        }

        }


    public static void main(String[] args) {

        int [] arr = {5,4,3,2,1};

        int size = arr.length;

        printArray(arr, size);
        bubbleSort(arr, size);
        System.out.println();
        printArray(arr, size);
        
    }
}
