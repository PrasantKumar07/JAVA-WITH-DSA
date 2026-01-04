public class ConvertLetterToUppercase {

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        // Convert first character to uppercase
        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            // If space found, convert next character to uppercase
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i)); // append space
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i)); // normal character
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "hi i am prashant";
        System.out.println(toUpperCase(str));
    }
}
