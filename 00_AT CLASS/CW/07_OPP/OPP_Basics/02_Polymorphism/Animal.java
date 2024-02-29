// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class inheriting from Animal
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Creating object of Dog class
        Animal myCat = new Cat(); // Creating object of Cat class

        myDog.sound(); // Calls Dog's sound method
        myCat.sound(); // Calls Cat's sound method
    }
}
