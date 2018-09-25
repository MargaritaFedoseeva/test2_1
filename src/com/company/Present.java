package com.company;

import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес конфет в граммах.");

        System.out.print("Шоколадные:");
        Chocolates chocolates = new Chocolates();
        int weight = scanner.nextInt();
        chocolates.setWeight(weight);
        chocolates.setPriseGram(PriceSweets.priceGram(chocolates.getPrice(), weight));

        System.out.print("Жевательные:");
        Jellybean jellybean = new Jellybean();
        weight = scanner.nextInt();
        jellybean.setWeight(weight);
        jellybean.setPriseGram(PriceSweets.priceGram(jellybean.getPrice(), weight));

        System.out.print("Леденцы:");
        Lollipop lollipop = new Lollipop();
        weight = scanner.nextInt();
        lollipop.setWeight(weight);
        lollipop.setPriseGram(PriceSweets.priceGram(lollipop.getPrice(), weight));

        scanner.close();

        System.out.println("Общий вес:" + PriceSweets.totalWeight);
        System.out.println("Общая цена:" + PriceSweets.totalCost);

        System.out.println("Информация по позициям");
        System.out.println(chocolates.getName() + ": " + chocolates.getPriseGram() + " руб. - стоимость за " + chocolates.getWeight() + " г, цена за кг" + chocolates.getPrice() + " руб.");
        System.out.println(jellybean.getName() + ": " + jellybean.getPriseGram() + " руб. - стоимость за " + jellybean.getWeight() + " г , цена за кг" + jellybean.getPrice() + " руб.");
        System.out.println(lollipop.getName() + ": " + lollipop.getPriseGram() + " руб. - стоимость за " + lollipop.getWeight() + " г , цена за кг" + lollipop.getPrice() + " руб.");


    }
}
