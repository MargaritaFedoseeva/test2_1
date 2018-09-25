package com.company;

import java.util.Scanner;

public class Present {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес конфет в граммах.");

        System.out.print("Шоколадные:");
        Chocolates chocolates = new Chocolates();
        int weight = scanner.nextInt();
        PriceSweets.priceGram(chocolates.getPrice(), weight);

        System.out.print("Жевательные:");
        Jellybean jellybean = new Jellybean();
        weight = scanner.nextInt();
        PriceSweets.priceGram(jellybean.getPrice(), weight);

        System.out.print("Леденцы:");
        Lollipop lollipop = new Lollipop();
        weight = scanner.nextInt();
        PriceSweets.priceGram(lollipop.getPrice(), weight);

        scanner.close();

        System.out.println("Общий вес:" + PriceSweets.totalWeight);
        System.out.println("Общая цена:" + PriceSweets.totalCost);

        System.out.println("Информация по позициям");
        System.out.println(chocolates.getName() + ": стоимость " + chocolates.getPrice() +", вес за ");
        System.out.println(jellybean.getName() + ": стоимость " + jellybean.getPrice());
        System.out.println(lollipop.getName() + ": стоимость " + lollipop.getPrice());


    }
}
