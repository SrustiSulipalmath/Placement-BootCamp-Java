public class indexOut {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        try{
            System.out.println(arr[5]);
        }catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
