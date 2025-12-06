
// O(n) time, O(1) space
public class besttimetobuysellonce. {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            if (p < minPrice) minPrice = p;
            else if (p - minPrice > maxProfit) maxProfit = p - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max profit (one transaction): " + maxProfit(prices)); // 5
    }
}
// O(n) time, O(1) space
/*public class BestTimeToBuySellOnce {
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int p : prices) {
            if (p < minPrice) minPrice = p;
            else if (p - minPrice > maxProfit) maxProfit = p - minPrice;
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max profit (one transaction): " + maxProfit(prices)); // 5
    }
}*/
