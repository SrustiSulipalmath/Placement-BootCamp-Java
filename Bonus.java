
import java.util.*;
public class Bonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int bonus = 0;
        if(a>=2 || a<=5){
            bonus = 5000;
            System.out.println("Years of Experience : "+a);
            System.out.println("Bonus : "+bonus);
        }
        else if(a>5){
            bonus = 10000;
            System.out.println("Years of Experience : "+a);
            System.out.println("Bonus : "+bonus);
        }
        else{
           bonus = 0; 
           System.out.println("Years of Experience : "+a);
           System.out.println("Bonus : "+bonus);
        }
    }
    
}
