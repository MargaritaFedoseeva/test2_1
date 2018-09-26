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

    public static void totalWeightAndCost(){
        System.out.println("Общий вес:" + PriceSweets.totalWeight);
        System.out.println("Общая цена:" + PriceSweets.totalCost);
    }
}
