public class buyandsellstock {

    public static int buyAndSellstockprofit(int price[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = price[i];
            }
            System.out.println("Buyprice: " + buyprice + " Maxprofit: " + maxprofit);
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println(buyAndSellstockprofit(prices));
    }
}
