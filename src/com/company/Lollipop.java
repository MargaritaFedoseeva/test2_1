package com.company;

/**
 * Created by ruafem4 on 25.09.2018.
 */
public class Lollipop {
    private double price;
    private String name;
    private double weight;
    private double priseGram;

    public Lollipop() {
        price = 100;
        name = "Леденцы";
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
