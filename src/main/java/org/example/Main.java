package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen1 = new SmartKitchen();

        System.out.println("---------------------");


        smartKitchen1.getCoffeeMaker().brewCoffee();
        smartKitchen1.getDishwasher().doDishes();
        smartKitchen1.getRefrigerator().orderFood();

        System.out.println("---------------------");

        smartKitchen1.addWater();
        smartKitchen1.pourMilk();
        smartKitchen1.loadDishwasher();

        System.out.println("---------------------");

        smartKitchen1.setKitchenState(true, true, true);

    }
}