package com.matheus;

public class ShowData {
    public void display(UsuarioJogo player) {
        System.out.printf("O jogador %1s está com %2s pontos e no nível %3s", player.getNickname(), player.getPontuacao(), player.getNivel());
    }
}
