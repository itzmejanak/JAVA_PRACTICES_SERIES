/**
 * Write a description of class Animal here.
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal {
    private int age;
    private String breed;
    private String name;

    // Getter for age
    public int getAge() {
        return age;
    }
    
    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
    
    // Getter for breed
    public String getBreed() {
        return breed;
    }
    
    // Setter for breed
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Method for the animal to walk
    public void walk() {
        System.out.println(" Aniaml is walking");
    }
}
