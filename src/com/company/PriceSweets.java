package com.company;


public class PriceSweets {
    public static double priceGram(double price, double weight) {
        double cost = weight / 1000 * price;
        return cost;
    }
}
