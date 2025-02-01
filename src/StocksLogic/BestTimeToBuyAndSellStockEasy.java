package StocksLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BestTimeToBuyAndSellStockEasy {

    public static int findBestStock(Integer[] stockPrices){
        int maxProfit = 0;
        int length = stockPrices.length;
        int buyAt = stockPrices[0];
        for(int i = 1; i < length; i++){
            if(buyAt < stockPrices[i]){
                buyAt = stockPrices[i];
            }
            int currentDiff = buyAt;
            maxProfit = Math.max(maxProfit, currentDiff);
        }
        return maxProfit;
    }

    public static void main(String[] args){
        List<Integer[]> stockWeek = new ArrayList<>();
        stockWeek.add(new Integer[]{10,4,5,3,2});
        stockWeek.add(new Integer[]{1,19});
        stockWeek.add(new Integer[]{10,1});
        stockWeek.add(new Integer[]{10,40,15,11,23});
        AtomicInteger index = new AtomicInteger(1);
        stockWeek.forEach((week ) -> {
            int maxProfit = findBestStock(week);
            System.out.println("maxProfit for week: "+ index +" Max Profit is: "+maxProfit);
            index.getAndIncrement();
        });

    }
}
