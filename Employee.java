public class Employee {
    String Name;
    int exp;

   public Employee(String name,int experience){
    this.Name= name;
    this.exp= experience;
    }

public void display(){
    System.out.println("Name : "+ Name+", Experience : "+exp+ " years");
    Bonus(exp);
}

public void Bonus(int a){
     int bonus = 0;
     if(a>=2 || a<=5){
            bonus = 5000;
            System.out.println("Bonus : "+bonus);
        }
        else if(a>5){
            bonus = 10000;
            System.out.println("Bonus : "+bonus);
        }
        else{
           bonus = 0; 
           System.out.println("Bonus : "+bonus);
        }
}

public static void main(String[] args){

    Employee e1 = new Employee("Srusti",2);
    e1.display();
}

   
}
