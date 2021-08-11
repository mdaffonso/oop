package com.company;

public class Fish extends Pet {
    Fish(String name, int age, double dailyFood, String sound) {
        super(name, age, dailyFood, sound);
        this.petType = "peixe";
        this.convertFoodToGrams();
    }

    public String message() {
        return String.format("%1$s As suas bolhas de ar fazem \"%2$s\".", this.getBasicMessage(), this.sound);
    }
}
