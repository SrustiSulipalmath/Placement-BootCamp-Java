import java.util.Arrays;

public class mergeSort1 {
    public static void mergeSort(int[] arr){
        if(arr == null || arr.length <=1 ){
            return;
        }

        int mid = arr.length/2;

        int[] leftHalf = Arrays.copyOfRange(arr,0,mid);
        int[] rightHalf = Arrays.copyOfRange(arr,mid,arr.length);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(arr,leftHalf,rightHalf);
    }

    private static void merge(int[] arr,int[] leftHalf, int[] rightHalf){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i<leftHalf.length && j<rightHalf.length){
            if(leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }else{
                arr[k] = rightHalf[j];
                j++;

            }
            k++;
        }

        while(i<leftHalf.length){
            arr[k]=leftHalf[i];
            i++;
            k++;
        }

        while(j<rightHalf.length){
            arr[k]=rightHalf[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] myArr = {7,4,3,9,1,2};
        System.out.println("Original Array : "+ Arrays.toString(myArr));

        int[] arrMerge = Arrays.copyOf(myArr,myArr.length);
        mergeSort(arrMerge);
        System.out.println("Merge Sort: "+ Arrays.toString(arrMerge));

    }
}
