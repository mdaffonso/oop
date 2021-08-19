package com.matheus;

public class Client {
    private String numeroCliente;
    private String nome;
    private Double divida;

    public void Cliente(String numero, String nome) {
        this.numeroCliente = numero;
        this.nome = nome;
    }

    public Double aumentarDivida(Double valor) {
        this.divida += valor;
        return this.divida;
    }
    public void pagarDivida() {
        this.divida = 0.0;
    }
}
