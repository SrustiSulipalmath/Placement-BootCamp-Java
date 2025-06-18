public class objectcreation {

    String Name;
    int age;

    objectcreation(String Name,int age){
        this.Name = Name;
        this.age = age;
    }
    public void display(){
        System.out.print(this.Name+ " " +this.age);
    }
    public static void main(String[] args) {
        objectcreation o1 = new objectcreation("srusti",22);
        o1.display();
    }
}
