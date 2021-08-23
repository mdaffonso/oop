package com.matheus;

import java.util.List;

public class Passageiro {
    private String cpf;
    private String nome;
    private Endereco origem;
    private List<Endereco> destinos;
    private List<Telefone> telefones;

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getOrigem() {
        return origem;
    }

    public void setOrigem(Endereco origem) {
        this.origem = origem;
    }

    public List<Endereco> getDestinos() {
        return destinos;
    }

    public void setDestinos(List<Endereco> destinos) {
        this.destinos = destinos;
    }
}
