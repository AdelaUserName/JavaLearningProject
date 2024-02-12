package com.AdelaQA.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        // Declararea si initializarea obiectelor folosind toate tipurile de constructori
        Car mercedesBenzSeriaE = new Car("E Class", "Mercedes", "Verde");

        mercedesBenzSeriaE.plateNumber = "PRA 985";
        mercedesBenzSeriaE.kmWhenEnteredTheService = 154478;

        System.out.println("Masina " + mercedesBenzSeriaE.make + " de model " + mercedesBenzSeriaE.model +
                " de culoare " + mercedesBenzSeriaE.color + " are numarul de inmatriculare " + mercedesBenzSeriaE.plateNumber
                + "si kilometrajul" + mercedesBenzSeriaE.kmWhenEnteredTheService);

        Car vwPolo = new Car("HTE 455");
        Car volvoXC90 = new Car("BOS 356");

        Tool ciocan = new Tool("ciocan");
        ciocan.weight = 1.65;
        System.out.println("Instrumentul cu numele " + ciocan.name + "are greutatea de " + ciocan.weight);

        Tool surubelnita = new Tool();
        Worker ionMuncitor = new Worker();
        Garage garageBavaria = new Garage();
    }
}
