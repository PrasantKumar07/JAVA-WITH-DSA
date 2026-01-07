public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(""); // empty string
        for(char sh = 'a'; sh <= 'z'; sh++){    // a to z characters 
            sb.append(sh); // appending characters to stringbuilder
        }
        System.out.println(sb);             // converting to string and printing
        System.out.println(sb.reverse().toString());   // reversing and printing
        System.out.println(sb.length());          // length of stringbuilder
        System.out.println(sb.charAt(15)); // character at index 5
    }
}
