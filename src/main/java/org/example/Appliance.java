package org.example;

public class Appliance {
    private boolean hasWorkToDo;

    public Appliance() {
        this.hasWorkToDo = false;
    }

    public boolean getHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}


class Refrigerator extends Appliance{
    public Refrigerator() {
    }

    public void orderFood(){
        this.setHasWorkToDo(true);
        if(getHasWorkToDo()) {
            System.out.println("Fridge is out of food, time to order more");
        }
    }




}

class Dishwasher extends Appliance {
    public Dishwasher() {
    }

    public void doDishes(){
        this.setHasWorkToDo(true);
        if(getHasWorkToDo()) {
            System.out.println("Lots of dirty dishes. Time to clean them");
        }
    }
}

class CoffeeMaker extends Appliance {
    public CoffeeMaker() {
    }

    public void brewCoffee(){
        this.setHasWorkToDo(true);
        if(getHasWorkToDo()) {
            System.out.println("Time to brew some coffee");
        }
    }

}


