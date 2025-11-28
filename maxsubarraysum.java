// max subarray sum problem

public class maxsubarraysum {
    public static void maxsubarraySum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){// end index
                int end = j;
                currsum  = 0;
                // calculate subarray sum
                for(int k = start; k<=end;k++){
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("maximum subarray sum is:" +maxsum);

    }

    public static void main(String[] args){
        int numbers[] = {1,-2, 6,-1,3};
        maxsubarraySum(numbers);
    }
    
}
