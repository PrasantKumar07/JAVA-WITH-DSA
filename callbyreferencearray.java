
// value pass by call by reference in java 
public class callbyreferencearray {
    public static void update(int marks[], int nonChangable){
        nonChangable = 10;  // No effect outside the method
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        int nonChangable = 5;

        update(marks, nonChangable);

        System.out.println(nonChangable);   // Still prints 5

        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
