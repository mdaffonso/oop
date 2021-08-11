package com.company;

public class Dog extends Pet {
    Dog(String name, int age, double dailyFood, String sound) {
        super(name, age, dailyFood, sound);
        this.petType = "cão";
    }

    public String message() {
        return String.format("%1$s O seu latido faz \"%2$s\".", this.getBasicMessage(), this.sound);
    }
}
