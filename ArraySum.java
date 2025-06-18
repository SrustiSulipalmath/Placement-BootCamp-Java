import java.util.*;

public class ArraySum{
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6};
        // int sum = 0;
        // for(int i =0;i<arr.length;i++){
        //     sum +=arr[i];
        // }
        // System.out.print(sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter "+(i+1)+"th element");
            arr[i]=sc.nextInt();
        }

        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum +=arr[i];
        }


       
        System.out.print("Sum : "+sum);

    }
}
