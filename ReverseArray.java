import java.util.Scanner;

public class ReverseArray {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of the Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter "+(i+1)+"th element");
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array : ");
        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed Array : ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
