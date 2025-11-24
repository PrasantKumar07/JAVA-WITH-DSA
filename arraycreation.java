
import java.util.Scanner;

public class arraycreation {
    public static void main(String[] args) {
        int marks[] = new int[50]; // Declaration and instantiation
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); // Initialization
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("Marks of student 1: " + marks[0]); // Access
        System.out.println("Marks of student 2: " + marks[1]);
        System.out.println("Marks of student 3: " + marks[2]);

        marks[2] = marks[2]+1;
        System.out.println(" updated maths marks:" + marks[2]);

        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage:"+ percentage);


        sc.close();
        
    }
    
}
