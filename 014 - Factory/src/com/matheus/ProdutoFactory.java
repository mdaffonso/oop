package com.matheus;

public class ProdutoFactory {
    public static Produto criar(String arg) throws InvalidObjectException {
        switch(arg) {
            case "CAIXA10X10":
                return new Caixa(0.1, 0.1, 0.1);

            case "FUTEBOL":
                return new Bola(0.11);

            case "BOLATENIS":
                return new Bola(0.032);

            case "CAIXA":
                return new Caixa();

            case "BOLA":
                return new Bola();

            default:
                throw new InvalidObjectException();
        }
    }
}
