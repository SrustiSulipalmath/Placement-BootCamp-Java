import java.util.*;

public class typecasting {

    public static void Typecasting(int n){
        if(n>0){
            System.out.println("Positive Number");
        }else{
            System.out.println("Negative Number");
        }

        if(n%2 == 0){
             System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        for(int i = 2; i<n/2;i++){
            if(!(n%i==0)){
                System.out.println("Prime Number");
                break;
            }else{
            System.out.println("Not a Prime Number");
            break;
        }
     }
        float f = digitSum(n);
        int result = (int) f;
        System.out.println(result);

    }
     public static int digitSum(int n){
            if(n<10){
                return n;
            }

            int sum = 0;
            while(n!=0){
                sum += n%10;
                n/=10;
            }
            return digitSum(sum);

        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Typecasting(n);
        
    }
    
}
