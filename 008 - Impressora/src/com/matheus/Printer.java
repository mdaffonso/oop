package com.matheus;

import java.time.LocalDate;

public class Printer {
    private final String model;
    private final LocalDate manufacturingDate;
    private String connectionType = "USB";
    private int availableSheets;

    private boolean hasPaper() {
        return availableSheets > 0;
    }

    private void usePaper() {
        setAvailableSheets(availableSheets - 1);
    }

    private String setupForPrint(String text) {
        String finalizedText = text;
        if(!hasPaper()) {
            finalizedText = "Sem papel...";
        }
        return finalizedText;
    }

    public Printer(String model, LocalDate manufacturingDate) {
        this.model = model;
        this.manufacturingDate = manufacturingDate;
    }

    public void print(String text) {
        System.out.println(setupForPrint(text));
        usePaper();
    }

    public String getModel() {
        return model;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public int getAvailableSheets() {
        return availableSheets;
    }

    public void setAvailableSheets(int availableSheets) {
        this.availableSheets = availableSheets;
    }

    public void addPaper(int quantity) {
        setAvailableSheets(availableSheets + quantity);
    }
}
