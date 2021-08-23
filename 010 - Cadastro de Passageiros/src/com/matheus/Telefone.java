package com.matheus;

public class Telefone {
    private String ddd;
    private String numero;
    private TelefoneTipo tipo;

    public Telefone(String ddd, String numero, TelefoneTipo tipo) {
        this.ddd = ddd;
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TelefoneTipo getTipo() {
        return tipo;
    }

    public void setTipo(TelefoneTipo tipo) {
        this.tipo = tipo;
    }
}
