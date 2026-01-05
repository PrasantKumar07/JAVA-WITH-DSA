

public class palindromecode {
    public static boolean ispalindrome(String str){
        int n = str.length();
        for(int i = 0; i < n/2; i++){ // loop till half length of string
            if(str.charAt(i) != str.charAt(n-1-i)){ // comparing first and last characters
                return false;   // if not equal return false
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(ispalindrome(str));
    }
    
}
