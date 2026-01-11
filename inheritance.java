public class inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.eat();      // inherited method
       // d1.breathe(); // inherited method
       // d1.bark();    // child method
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eating...");
    }

    void breathe() {
        System.out.println("breathing...");
    }
}

// Derived class
class Dog extends Animal {
    int legs;

    void bark() {
        System.out.println("barking...");
    }
}
