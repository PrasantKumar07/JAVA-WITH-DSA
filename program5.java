import java.util.Scanner;// sum of first 12 natural numbers
public class program5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            System.out.println("The sum of first " + i + " natural numbers is: " + (i*(i+1))/2);
        }   

    }
}
