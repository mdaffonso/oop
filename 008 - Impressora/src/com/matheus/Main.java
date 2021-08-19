package com.matheus;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer("BLACK-FW-17", LocalDate.of(2014, 9, 15));
        printer.print("Imprime saporra!");
        printer.addPaper(3);
        printer.print("EU MANDEI IMPRIMIR!");
        printer.print("Acho bom mesmo...");
        printer.print("TÁ ACABANDO O PAPEL!!!!");
        printer.print("AAAAAAAAAAAAAAA");
        printer.print("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.printf("Modelo: %1s | Conexão: %2s | Fabricação: %3s | Folhas na bandeja: %4s", printer.getModel(), printer.getConnectionType(), printer.getManufacturingDate(), printer.getAvailableSheets());
    }
}
