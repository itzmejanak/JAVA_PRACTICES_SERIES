public class Student
{
    String name;
    int section = 4;

    public int walk(){
        System.out.println(name+" is walking");
        if(name == "Bibash"){
            return 5;
        }else{
            return 10;
        }
    }

    public void eat(String chocolate, int quantity){
        System.out.println(name+" is eating "+quantity+" "+chocolate);
    }

    public static void main(String[] args){
        
         
        Student student3 = new Student();
        student3.name = "Sujima";
        student3.eat( "Kitkat", 1);
        student3.eat( "Toblerone", 5);
        
        Student student1 = new Student();
        student1.name = "Bibash";

        Student student2 = new Student();
        student2.name = "Prabesh";
       

        // System.out.println(student1.walk());
        // student1.eat();

        // int sujima = student2.walk();
        // System.out.println(sujima);
        // student2.eat();
    }

}