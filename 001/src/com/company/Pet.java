package com.company;

public class Pet {
    String name;
    String sound;
    int age;
    double dailyFood;
    String foodMeasurement;
    String petType;

    Pet(String name, int age, double dailyFood, String sound) {
        this.name = name;
        this.age = age;
        this.dailyFood = dailyFood;
        this.sound = sound;
        this.foodMeasurement = "kg";
        this.petType = "bichinho";
    }

    public void convertFoodToGrams() {
        if(this.dailyFood < 1) {
            this.dailyFood = this.dailyFood * 1000;
            this.foodMeasurement = "gramas";
        }
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getDailyFood() {
        return this.dailyFood;
    }

    public String sound() {
        return this.sound;
    }

    public String getBasicMessage() {
        return String.format("%1$s é um %2$s que tem %3$s anos de idade e consome %4$s %5$s de comida todo dia.", this.name, this.petType, this.age, this.dailyFood, this.foodMeasurement);
    }
}
