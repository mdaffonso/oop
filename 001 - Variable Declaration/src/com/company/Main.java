package com.company;

public class Main {
    public static void main(String[] args) {
        Dog shesheu = new Dog("Shesheu", 2, 1.5, "Au au");
        Fish nemo = new Fish("Nemo", 1, 0.1, "Glub glub glub");
        Cat snow = new Cat("Snow", 3, 0.5, "Miaaaaaaaaaaau!");

        System.out.println(shesheu.message());
        System.out.println(nemo.message());
        System.out.println(snow.message());
    }
}
