package com.blz;

public class Stock {
    private String stockName;
    private int numOfShares, sharePrice, totalValue;

    public Stock(String stockName, int numOfShares, int sharePrice, int totalValue) {
        setStockName(stockName);
        setNumOfShares(numOfShares);
        setSharePrice(sharePrice);
        setTotalValue(totalValue);
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = sharePrice * numOfShares;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "stockName='" + stockName + '\'' +
                ", numOfShares=" + numOfShares +
                ", sharePrice=" + sharePrice +
                ", totalValue=" + totalValue +
                '}';
    }
}
