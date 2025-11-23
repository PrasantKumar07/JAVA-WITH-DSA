public class invertedsta {// inverted star print
    public static void main(String[] args){
        for(int line = 4; line >= 1; line--){
            for(int star = 1; star <= line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

// secod method   (n-i+1)
/* int n =4;
 * for(int line = 1; line<=n; line++){ 
 *   for(int star = 1; star<=4-line+1; star++)
         system.out.print("*");
}
         System.out.println(); 
}
 */