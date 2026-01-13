

public class polymorphism_overloading {
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();

        // Calling add method with two integers
        System.out.println("Sum of 2 and 3: " + mo.add(2, 3));

        // Calling add method with three integers
        System.out.println("Sum of 2, 3 and 4: " + mo.add(2, 3, 4));

        // Calling add method with two double values
        System.out.println("Sum of 2.5 and 3.5: " + mo.add(2.5, 3.5));
        
    }
    
}

class MathOperation {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}