package com.AdelaQA.classesandobjects.autoservicetask;

public class Tool {
    double price;
    String name;
    boolean isUsed;
    double weight;

    public Tool(String name) {
        this.name = name;
        System.out.println("Un obiect de tip tool a fost creat, numele lui este " + this.name);
    }

    public Tool() {
        System.out.println("O noua unealta a fost creata in cadrul programului. Nu dispunem despre detaliile ei");
    }

}
