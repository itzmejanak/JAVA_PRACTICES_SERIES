
public class Dec28
{
    private int age;
    private String name;

    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    public void setName(String name){
        if (name=="hell"){
            this.name="Not Available";
        }
        this.name=name;
    }
    
    public void setAge(int age){
        if (age>100){
            this.age=0;
        }else if(age<0){
            this.age=0;
        }else{
            this.age=age;
        }
    }
}

