

public class classesandobject {
    int id;
    String name;

    // method to display the values
    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        // creating objects
        classesandobject obj1 = new classesandobject();
        classesandobject obj2 = new classesandobject();

        // assigning values to object 1
        obj1.id = 101;
        obj1.name = "Alice";

        // assigning values to object 2
        obj2.id = 102;
        obj2.name = "Bob";

        // displaying values of object 1
        obj1.display();

        // displaying values of object 2
        obj2.display();
    }
    
}
