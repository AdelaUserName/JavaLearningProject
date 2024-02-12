package com.AdelaQA.classesandobjects.autoservicetask;

public class Car {
    int kmWhenEnteredTheService;
    String plateNumber;
    String color;
    String model;
    String make;
    int productionYear;
    double price;

    // Contrustorul de mai jos primeste 3 parametri de intrare, in rezultat va crea un Obiect Car despre care se va cunoaste marca, modelul, culoarea, dar nu si detalii precum plateNumber sau km
    public Car(String makeParametruIntrare,
               String modelFormalParameter,
               String colorLocalVariable) {
        this.model = modelFormalParameter;
        this.make = makeParametruIntrare;
        this.color = colorLocalVariable;
    }

    // Acest constructor va crea un obiect de tipul Car despre care vom cunoaste doar numarul de inmatriculare
    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }
}
