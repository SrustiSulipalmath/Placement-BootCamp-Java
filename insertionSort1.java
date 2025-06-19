import java.util.Arrays;

public class insertionSort1 {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args){
        int[] myArr = {7,4,3,9,1,2};

        System.out.println("Original Array : "+Arrays.toString(myArr));

        int[] arrInsertion = Arrays.copyOf(myArr,myArr.length);
        insertionSort(arrInsertion);
        System.out.println("Insertion Sort : "+Arrays.toString(arrInsertion));
    }
}
