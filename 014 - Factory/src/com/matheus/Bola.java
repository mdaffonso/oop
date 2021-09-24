package com.matheus;

public class Bola extends Produto {
    private double raio;
    private double volume;

    Bola() {}
    Bola(double raio) {
        this.raio = raio;
        this.setVolume(calcularEspaco());
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularEspaco() {
        return (4/3) * Math.PI * (Math.pow(this.raio, 3));
    }
}
