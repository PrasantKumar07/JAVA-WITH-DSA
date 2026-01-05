
// PrintLargestString.java

public class PrintLargestString {
    public static void main(String[] args) {
        String fruits = "apple mango banana orange";

        // Split the string into an array
        String[] fruit = fruits.split(" "); //space as delimiter

        String largest = fruit[0]; // Assume first string is largest

        for (int i = 1; i < fruit.length; i++) {
            if (largest.compareTo(fruit[i]) < 0) { // compareTo returns negative if largest < fruit[i]
                largest = fruit[i]; // Update largest
            }
        }

        System.out.println("Largest string (lexicographically): " + largest);
    }
}
