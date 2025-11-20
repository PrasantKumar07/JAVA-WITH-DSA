import java.util.Scanner; // Area of circle

public class areaof_circle {
    public static void main(String[] args){
        Scanner var = new Scanner(System.in);
        double rad  = var.nextDouble();
        double area = 3.14 * rad * rad;
        System.out.println("The area of circle with radius " + rad + " is: " + area);
    }
    
}
