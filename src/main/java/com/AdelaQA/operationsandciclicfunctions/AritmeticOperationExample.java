package com.AdelaQA.operationsandciclicfunctions;

public class AritmeticOperationExample {

    public static void main(String[] args) {
        int a = 43;
        int c = 3;

        //Sum
        int sum = a + c;
        System.out.println("Suma: " + sum);
        System.out.println("Suma: " + (a + c));

        //Substraction
        int sub = a - c;
        System.out.println("Rezultatul: " + sub);

        //Multiplication
        int result = a * c;
        System.out.println("Inmultirea: " + result);

        //Devision
        int div = a / c;
        System.out.println("Impartirea: " + div);

        //The rest of division or Devision with reminder
        int rest = a % c;
        System.out.println("Rest: " + rest);

    }
}
