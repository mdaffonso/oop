package com.matheus;

public class Animal {
    private final String name;
    private String breed;
    private int yearOfBirth;
    private Double weightInKilograms;
    private boolean isAvailable = true;
    private boolean isChipped = false;
    private boolean isWounded = false;

    public Animal(String name, String breed, int yearOfBirth, Double weightInKilograms, boolean isAvailable, boolean isChipped, boolean isWounded) {
        this.name = name;
        this.breed = breed;
        this.yearOfBirth = yearOfBirth;
        this.weightInKilograms = weightInKilograms;
        this.isAvailable = isAvailable;
        this.isChipped = isChipped;
        this.isWounded = isWounded;
    }

    public Animal(String name) {
        this.name = name;
        setAvailable();
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public void setWeightInKilograms(Double weightInKilograms) {
        this.weightInKilograms = weightInKilograms;
    }

    public void setAvailable() {
        isAvailable = weightInKilograms > 5 && !isWounded;
    }

    public void setChipped(boolean chipped) {
        isChipped = chipped;
    }

    public void setWounded(boolean wounded) {
        isWounded = wounded;
    }

    public boolean canGetLost() {
        return !isChipped;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public Double getWeightInKilograms() {
        return weightInKilograms;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean isChipped() {
        return isChipped;
    }

    public boolean isWounded() {
        return isWounded;
    }
}
