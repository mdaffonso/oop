package com.matheus;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UsuarioJogo capiroto = new UsuarioJogo("Matheus", "capiroto");
        UsuarioJogo inimiga = new UsuarioJogo("Adryana", "inimiga");

        ShowData showData = new ShowData();

        capiroto.subirNivel();
        capiroto.pontuar(32);

        inimiga.pontuar();
        inimiga.subirNivel(25);

        showData.display(capiroto);
        showData.display(inimiga);
    }
}

