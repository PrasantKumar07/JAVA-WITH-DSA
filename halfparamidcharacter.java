public class halfparamidcharacter {
  public static void main(String[] args){
    int n = 26;
    char ch = 'A'; // Starting character
    for(int i =1; i<=n; i++){
        for(int j = 1; j<=i; j++){
            System.out.print(ch);
            ch++; // Increment character for next position
        }
        System.out.println();
    }
  }  
}
