import java.util.Arrays;


public class BubbleSort1 {
    public static void bubbleSort(int[] arr){

        int i,j,temp;
        int n = arr.length;
        boolean swapped;

        for(i =0;i<n;i++){
            swapped = false;
            for(j =0; j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                 temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }
        if(!swapped){
            break;
        }
    }

    }

      public static void main(String[] args){
            int[] myArr = {7,4,3,9,1,2};
            System.out.println("Original Array : "+Arrays.toString(myArr));

            int[] arrBubble = Arrays.copyOf(myArr,myArr.length);
            bubbleSort(arrBubble);
            System.out.println("Bubble Sort : "+Arrays.toString(arrBubble));
        }
}
