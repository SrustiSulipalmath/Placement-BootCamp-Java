public class TryCatchFinallyDemo {
    public static void main(String[] args){
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            System.out.println("Can't divide by zero!");
        }finally{
            System.out.println("this block executes all the time");
        }
    }
}
