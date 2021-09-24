package com.matheus;

public abstract class Produto {
    private double peso;
    private double volume;
    public double getVolume() { return this.volume; }
    public abstract double calcularEspaco();
}
