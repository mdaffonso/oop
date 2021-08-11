package com.company;

public class Cat extends Pet {
    Cat(String name, int age, double dailyFood, String sound) {
        super(name, age, dailyFood, sound);
        this.petType = "gato";
    }

    public String message() {
        return String.format("%1$s Seu miado soa assim: \"%2$s\".", this.getBasicMessage(), this.sound);
    }
}
