import java.util.*;
public class armstrong {

    public static boolean Armstrong(int n){
        int t1 = n;
        int len = 0;

        while(t1!=0){
            len++;
            t1 = t1/10;
        }

        int t2 = n;
        int arm = 0;
        while(t2!=0){
            int rem = t2%10;
            int mul = 1;
            for(int i = 1; i<=len;i++){
                mul = mul*rem;
            }

            arm = arm +mul;
            t2 = t2/10;
        }

        if(arm==n){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Armstrong(n));


        
    }
}
