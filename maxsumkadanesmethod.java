// Third method using kadane's algorithm to find maximum subarray sum

public class maxsumkadanesmethod {
    public static void KadaneMaxSubarraySum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i = 4 ; i <numbers.length; i++){
            currsum = currsum + numbers[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("maxsum using kadane's method is: " + maxsum);
    }

    public static void main(String[] args){
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        KadaneMaxSubarraySum(numbers);

    }
    
}
