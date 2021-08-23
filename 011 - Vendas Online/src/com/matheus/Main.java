package com.matheus;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente fulano = new Cliente();
        fulano.setNome("Fulano das Couves");
        fulano.setTelefone("51987987987");

        Endereco endereco = new Endereco();
        endereco.setEndereco("Rua de Tal, 123");
        endereco.setCep("91020-150");
        endereco.setCidade("Porto Alegre");
        endereco.setUf("RS");

        fulano.setEndereco(endereco);

        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Produto mouse = new Produto("Mouse Logitech", 250.00);
        Produto teclado = new Produto("Teclado Razer", 350.00);
        produtos.add(mouse);
        produtos.add(teclado);

        Pedido pedido = new Pedido();
        pedido.setCliente(fulano);
        pedido.setCodigo(RandomString.getAlphaNumericString(10));
        pedido.setProdutos(produtos);

        System.out.println("FIM");
    }
}
