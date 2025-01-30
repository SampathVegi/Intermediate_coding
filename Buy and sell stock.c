int maxProfit(int* prices, int pricesSize) {
    if (pricesSize < 2) {
        return 0;
    }

    int min_price = prices[0];  // Initialize min_price to the first price
    int max_profit = 0;  // Initialize max_profit to 0

    for (int i = 1; i < pricesSize; i++) {
        // If the current price is lower than the min_price, update min_price
        if (prices[i] < min_price) {
            min_price = prices[i];
        } else {
            // Calculate the profit if selling on the current day
            int profit = prices[i] - min_price;
            // Update max_profit if the current profit is greater
            if (profit > max_profit) {
                max_profit = profit;
            }
        }
    }

    return max_profit;
}
