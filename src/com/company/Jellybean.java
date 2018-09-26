package com.company;

/**
 * Created by ruafem4 on 25.09.2018.
 */
public class Jellybean {
    private double price;
    private String name;
    private double weight;
    private double priseGram;

    public Jellybean() {
        price = 250;
        name = "Жевательные";
    }

    public double getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight += weight;
    }

    public double getPriseGram() {
        return this.priseGram;
    }

    public void setPriseGram(double priseGram) {
        this.priseGram += priseGram;
    }
}
