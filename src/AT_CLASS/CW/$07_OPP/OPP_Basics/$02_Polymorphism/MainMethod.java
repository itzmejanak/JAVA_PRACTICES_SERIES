package AT_CLASS.CW.$07_OPP.OPP_Basics.$02_Polymorphism;

public class MainMethod {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Creating object of Dog class
        Animal myCat = new Cat(); // Creating object of Cat class

        myDog.sound(); // Calls Dog's sound method
        myCat.sound(); // Calls Cat's sound method
    }
}
