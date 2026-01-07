   // substring.java


public class substring {
    public static String getsubstring(String str , int si, int ei){
        String substr = " ";
        for(int i = si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String [] args){
        String str = "HelloWorld";
        //System.out.println(getsubstring(str, 0 ,5));// Hello
        //System.out.println(getsubstring(str ,3 ,5));// lo
        System.out.println(str.substring(0,5));
    }
    
}

/*public class SubstringExample {
    public static void main(String[] args) {
        String str = "HelloWorld";

        // Using built-in substring method
        String substr = str.substring(0, 5);  // 0 se 4 index tak (5 exclusive)

        System.out.println(substr);  // Output: Hello
    }
}
 */
