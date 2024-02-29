/**
 * Write a description of class Dog here.
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Animal {
    private String furColor;
    
    public Dog(String furColor) {
        this.furColor = furColor;
    }
    
    public void setFurColor(String furColor){
        this.furColor = furColor;
    }
    
    public String getFurColor(){
        return furColor;
    }
    
    @Override
    public void walk() {
        System.out.println("the Dog is walking which color is: " + furColor);
    }
   
    public void bark() {
        System.out.println("the Dog is barking" + "which color is:  "+furColor);
    }
}
