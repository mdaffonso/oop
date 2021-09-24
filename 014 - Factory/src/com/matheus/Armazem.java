package com.matheus;

import java.util.ArrayList;
import java.util.List;

public class Armazem {
    private List<Produto> produtos = new ArrayList<Produto>();
    private double espacoNecessario;

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public double calcularEspacoNecessario() {
        double espacoNecssario = 0.00;

        for (Produto produto : produtos) {
            espacoNecssario += produto.getVolume();
        }
        return espacoNecssario;
    }

    public double getEspacoNecessario() {
        return espacoNecessario;
    }

    public void setEspacoNecessario(double espacoNecessario) {
        this.espacoNecessario = espacoNecessario;
    }
}
