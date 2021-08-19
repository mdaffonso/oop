package com.matheus;

import java.util.ArrayList;

public class Institution {
    private String name;
    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public Institution(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void printInstitutionInfo() {
        String text = String.format("Instituição: %1s\n\n", name);
        text = text.concat("ANIMAIS:\n");
        for (int i = 0; i < animals.size(); i++) {
            text = text.concat("\nNome: " + animals.get(i).getName());
            text = text.concat("\nRaça: " + animals.get(i).getBreed());
            text = text.concat("\nAno de nascimento: " + animals.get(i).getYearOfBirth());
            text = text.concat("\nPeso: " + animals.get(i).getWeightInKilograms() + "kg");
            text = text.concat("\nDisponibilidade: " + (animals.get(i).isAvailable() ? "disponível" : "não disponível"));
            text = text.concat("\nCom chip: " + (animals.get(i).isChipped() ? "com chip" : "sem chip") + "\n");
        }

        System.out.println(text);
    }
}
