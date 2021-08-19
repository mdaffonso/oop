package com.matheus;

public class Main {
    public static void main(String[] args) {
        Institution institution = new Institution("Instituicão");

        Animal rex = new Animal("Rex", "Vira-lata", 2011, 7.13, true, false, false);
        Animal jonas = new Animal("Jonas", "Husky", 2009, 9.42, false, true, true);

        institution.addAnimal(rex);
        institution.addAnimal(jonas);

        institution.printInstitutionInfo();
    }
}
