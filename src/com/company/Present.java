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
        double totalWeight = chocolates.getWeight()+ jellybean.getWeight()+ lollipop.getWeight();
        double totalCost = chocolates.getPriseGram()+jellybean.getPriseGram()+lollipop.getPriseGram();

        System.out.println("Общий вес:" + totalWeight);
        System.out.println("Общая цена:" + totalCost);

        System.out.println("Информация по позициям");
        System.out.println(chocolates.getName() + ": " + chocolates.getPriseGram() + " руб. - стоимость за " + chocolates.getWeight() + " г, " + chocolates.getPrice() + " руб. цена за кг");
        System.out.println(jellybean.getName() + ": " + jellybean.getPriseGram() + " руб. - стоимость за " + jellybean.getWeight() + " г, " + jellybean.getPrice() + " руб. цена за кг");
        System.out.println(lollipop.getName() + ": " + lollipop.getPriseGram() + " руб. - стоимость за " + lollipop.getWeight() + " г, " + lollipop.getPrice() + " руб. цена за кг");


    }
}
