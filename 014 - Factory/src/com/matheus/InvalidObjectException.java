package com.matheus;

public class InvalidObjectException extends Exception {
    InvalidObjectException() {
        System.out.println("Objeto inválido. Utilize CAIXA10X10, BOLATENIS, FUTEBOL, BOLA ou CAIXA como argumento.");
    }
}
