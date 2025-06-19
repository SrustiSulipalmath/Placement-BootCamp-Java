import java.util.Arrays;

public class selectionSort1 {
    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i = 0;i<n-1;i++){
            int min_idx = i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        int[] myArr = {7,4,3,9,1,2};
        System.out.println("Original Array : "+Arrays.toString(myArr));

        int[] arrSelection = Arrays.copyOf(myArr,myArr.length);
        selectionSort(arrSelection);
        System.out.println("Selection Sort : "+Arrays.toString(arrSelection));
    }
    
}
