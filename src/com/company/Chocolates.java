package com.company;

public class Chocolates {
    private double price;
    private String name;
    private double weight;
    private double priseGram;


    public Chocolates() {
        price = 360;
        name = "Шоколадные";
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
        this.weight+=weight;
    }

    public double getPriseGram() {
        return this.priseGram;
    }

    public void setPriseGram(double priseGram) {
        this.priseGram+=priseGram;
    }
}