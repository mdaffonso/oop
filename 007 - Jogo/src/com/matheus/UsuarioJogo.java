package com.matheus;

public class UsuarioJogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    UsuarioJogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }

    public void pontuar (int valor) {
        this.pontuacao += valor;
    }

    public void pontuar() {
        this.pontuar(1);
    }

    public void subirNivel(int valor) {
        this.nivel += valor;
    }

    public void subirNivel() {
        this.nivel += 1;
    }

    public String getNome() {
        return this.nome;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getPontuacao() {
        return this.pontuacao;
    }

    public int getNivel() {
        return this.nivel;
    }
}
