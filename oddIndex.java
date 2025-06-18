import java.io.FileReader;
import java.io.IOException;

public class oddIndex {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
            int ch;
            int position = 1;

            // while((ch= fr.read()) != -1){

            //     if(position%2!=0){
                    
            //         System.out.print((char) ch);
            //     }
            //     position++;

            // }

            while((ch = fr.read())!=-1){
                position++;
                if(position %2 == 0){
                    continue;
                }
                System.out.print((char) ch);
            }



            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





// import java.io.FileReader;
// import java.io.IOException;

// public class OddIndex {
//     public static void main(String[] args) {
//         try {
//             FileReader fr = new FileReader("data.txt");
//             int ch;
//             int position = 1;  // Start from position 1

//             while((ch = fr.read()) != -1){
//                 if(position % 2 != 0){  // Print only odd positions
//                     System.out.print((char) ch);
//                 }
//                 position++; // increase AFTER using position
//             }

//             fr.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }




