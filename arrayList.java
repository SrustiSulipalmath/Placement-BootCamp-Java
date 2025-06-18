import java.util.ArrayList;
public class arrayList {
    public static void main(String[] args) {
        
        ArrayList<String> students = new ArrayList<>();
        
        students.add("Anjali");
        students.add("Sneha");
        students.add("Rahul");
        students.add("Anjali");

        System.out.println("List of Students");

        for(String name: students){
            System.out.println(name);
        }

        System.out.println("First student: "+students.get(0));

    }
}
