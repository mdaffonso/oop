package com.matheus;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Passageiro matheus = new Passageiro();
        matheus.setNome("Matheus Affonso");

        Endereco origem = new Endereco();
        origem.setBairro("Santo Antônio");
        origem.setCidade("Porto Alegre");
        origem.setEndereco("Rua Luiz de Camões 864");
        origem.setUf("RS");

        matheus.setOrigem(origem);

        ArrayList<Telefone> telefones = new ArrayList<Telefone>();
        Telefone whatsapp = new Telefone("51", "993868729", TelefoneTipo.WHATSAPP);
        telefones.add(whatsapp);

        matheus.setTelefones(telefones);

        ArrayList<Endereco> destinos = new ArrayList<Endereco>();
        Endereco destino = new Endereco();
        destino.setEndereco("Rua São Guilherme, 197");
        destino.setBairro("Partenon");
        destino.setCidade("Porto Alegre");
        destino.setUf("RS");
        destinos.add(destino);

        matheus.setDestinos(destinos);

        System.out.println("FIM");
    }
}
