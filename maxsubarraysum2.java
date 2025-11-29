public class maxsubarraysum2 {
    public static void maxsubarraysum2(int numbers[]){
        int maxsum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){// start index
            int start = i;
            for(int j = i; j < numbers.length; j++){// end index
                int end = j;
                int currsum = 0;
                  // Calculate subarray sum
                for(int k = start; k <= end; k++){
                    currsum += numbers[k];
                }

                System.out.println(currsum);// print current subarray sum

                if(currsum > maxsum){// update maxsum
                    maxsum = currsum;// update
                }
            }
        }

        System.out.println("maximum subarray sum is: " + maxsum);
    }

    public static void main(String[] args){
        int numbers[] = {1,-2, 6,-1,3};
        maxsubarraysum2(numbers);
    }
}
