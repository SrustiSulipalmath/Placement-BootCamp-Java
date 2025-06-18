import java.io.FileWriter;
import java.io.IOException;


public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("output.text", true);
            fw.write("Hello,java file writing\n");
            fw.close();
            System.out.println("Data written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
