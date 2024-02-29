/**
 * Write a description of class Fish here.
 * @author (your name)
 * @version (a version number or a date)
 */
public class Fish extends Animal {
    private int numberOfFish;
    
    
    @Override
    public void walk() {
        System.out.println(getName() + " the fish is swimming");
    }
    
    public void waggle() {
        System.out.println(getName() + " the fish is waggling");
    }
}
