package com.blz;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StockPortfolio {
    private static List<Stock> stockList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);

    public static void addStock() {
        System.out.println("Enter the stock name");
        String stockName = scan.next();
        System.out.println("Enter no of shares");
        int numOfShares = scan.nextInt();
        System.out.println("Enter price of each share");
        int sharePrice = scan.nextInt();
        int totalPrice = numOfShares * sharePrice;
        Stock obj = new Stock(stockName, numOfShares, sharePrice, totalPrice);
        stockList.add(obj);
    }

    public static void printStock() {
        if (!stockList.isEmpty()) {
            System.out.println("Stock details are below.....\n");
            Iterator it = stockList.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        } else
            System.out.println("Stock list is empty.");
    }

    public static void main(String[] args) {

        System.out.println("Enter how many stocks you want to add!!!\nGive those stock details below");
        int count = scan.nextInt();
        for (int i = 1; i <= count; i++) {
            addStock();
        }

        printStock();
    }
}
