package com.company;


public class PriceSweets {
    public static double totalCost;
    public static double totalWeight;

    public static double priceGram(double price, double weight) {
        double cost = weight / 1000 * price;
        totalCost += cost;
        totalWeight += weight;
        return cost;
    }
}
