package com.AdelaQA.accessmodifiers;

import com.AdelaQA.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
//Crearea unui obict Person, numit ionPerson - folosind cuvantul cheie new si constructorul cu 3 parametri
        //definit in clasa Person
        Person ionPerson = new Person("Ion", "Burlacu", 458774455);

        //Proprietatea ionPerson.isRetired detine modificatorul public ceea ce ofera posibilitatea de al edita din oricare loc al proiectului
        ionPerson.isRetired = true;

        //Proprietatea isRetired este tip boolean si serveste drept conditie pentru instructiunea IF
        if (ionPerson.isRetired) {
            //Codul executat in cazul unei conditii True
            System.out.println("Ion este la pensie");
        } else {
            //codul in cazul unei conditii false in blocul IF
            System.out.println("Ion nu este la pensie");
        }
        Person dariaMecan = new Person("Daria", "Mecan", 46546546, "Chisinau", true);
        if (dariaMecan.isRetired) {
            //Codul executat in cazul unei conditii True
            System.out.println("Daria este la pensie");
        } else {
            //codul in cazul unei conditii false in blocul IF
            System.out.println("Daria nu este la pensie");
        }
    }}