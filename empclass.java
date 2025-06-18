public class empclass {
    private String Name;
    private int age;
    private int salary;

    empclass(String Name, int age, int salary){
        this.Name = Name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String newName){
        this.Name = newName;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setSalary(int newSalary){
        this.salary = newSalary;
    }

    public String getName(){
        return this.Name;
    }

    public int getAge(){
        return this.age;
    }
    public int getSalary(){
        return this.salary;
    }

    public void display(){
        System.out.println("Name : "+getName());
        System.out.println("age : "+getAge());
        System.out.println("salary : "+getSalary());
    }

    public static void main(String[] args) {
        empclass e1 = new empclass("Srusti",22,100000);
        e1.display();
    }
}
