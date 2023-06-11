package org.example;

public class SmartKitchen {

    private CoffeeMaker coffeeMaker;
    private Dishwasher dishwasher;

    private Refrigerator refrigerator;

    public SmartKitchen() {
        this.coffeeMaker = new CoffeeMaker();
        this.dishwasher = new Dishwasher();
        this.refrigerator = new Refrigerator();
    }

    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }

    public Dishwasher getDishwasher() {
        return dishwasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    //Coffee Maker
    public void addWater(){
        this.coffeeMaker.brewCoffee();
    }

    //Refrigerator
    public void pourMilk(){
        this.refrigerator.orderFood();
    }

    //Dishwasher
    public void loadDishwasher(){
        this.dishwasher.doDishes();
    }

    //All
    public void setKitchenState(boolean coffeeFlag, boolean refrigeratorFlag, boolean dishwasherFlag){
        if(coffeeFlag == true){
            this.coffeeMaker.brewCoffee();
        }
        if(refrigeratorFlag == true){
            this.refrigerator.orderFood();
        }
        if(dishwasherFlag == true){
            this.dishwasher.doDishes();
        }
    }

}












