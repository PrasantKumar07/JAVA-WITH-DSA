
import java.util.Scanner;
public class creationof2darray {
    public static void main(String[] args){
        int matrix [][] = new int [3][3]; // creation of 2d array
        int n = matrix.length; // number of rows
        int m = matrix[0].length; // number of columns

        //input
        Scanner sc = new Scanner(System.in);
        for(int i= 0; i<n; i++){
            for(int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt(); //taking input
            }
        }

        //output
        for(int i = 0; i<m; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " "); // printing the elements
            }
            System.out.println(); // new line after each row

        }
    }
}
