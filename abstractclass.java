
// abstract class example

public class abstractclass {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eats();
        h1.walk();
        System.out.println(h1.color);
      

        Chicken c1 = new Chicken();
        c1.eats();
        c1.walk();
        System.out.println(c1.color);

        mustang myhorse = new mustang();
        // constructor calling order: Animal -> Horse -> mustang
        
    }

    
}
abstract class Animal{  // animals class ki object nhi banega
    String color;    // abstract class can have constructor

    Animal(){       // constructor
        System.out.println("animal constructor called"); // default color

    }




    void eats(){
        System.out.println("Animal eats");
    }

    abstract void walk();
    
}
class Horse extends Animal{

    Horse() {
        System.out.println("horse constructor called");
    }
    

    void changecolor() {
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on  4 legs");

    }
}

class mustang extends Horse{
    mustang(){
        System.out.println("mustang constructor called");
    }
}



class Chicken extends Animal{
    void changecolor(){
        color = "white";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
