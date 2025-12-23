public class bubblesort{
    public static void bubblesortalgo(int arr[]){
        for(int pass = 0; pass < arr.length -1; pass++){  //n-1 passes
            for(int j = 0; j < arr.length -1 - pass; j++){  //n-1-pass comparisons
                if(arr[j] > arr[j+1]){  // condition for swapping
                    //swap
                    int temp = arr[j]; // temp variable
                    arr[j] = arr[j+1]; // swapping 
                    arr[j+1] = temp;// assigning temp value

                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i = 0; i<arr.length; i++){  // traversing the array
            System.out.println(arr[i] + " ");   // printing the elements  
        }
        System.out.println();  // new line after printing all elements
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        bubblesortalgo(arr);
        printarr(arr);
    }
}