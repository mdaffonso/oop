package com.matheus;

public class Caixa extends Produto {
    private double largura;
    private double altura;
    private double comprimento;
    private double volume;

    Caixa() {

    }

    Caixa(double l, double a, double c) {
        this.altura = a;
        this.largura = l;
        this.comprimento = c;
        this.setVolume(calcularEspaco());
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double calcularEspaco() {
        return largura * altura * comprimento;
    }
}
