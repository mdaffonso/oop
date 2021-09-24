package com.matheus;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {
        Produto bola = ProdutoFactory.criar("FUTEBOL");
        Produto caixa = ProdutoFactory.criar("CAIXA10X10");

        Armazem armazem = new Armazem();
        armazem.addProduto(bola);
        armazem.addProduto(caixa);

        armazem.setEspacoNecessario(armazem.calcularEspacoNecessario());

        System.out.println("");
    }
}
