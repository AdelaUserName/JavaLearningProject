package com.AdelaQA.operationsandciclicfunctions;

public class GradeSystemService {
    public static void main(String[] args) {
        int testResult = 40;

        if (testResult >= 90) {
            System.out.println("A");
        } else if (testResult >= 80) {
            System.out.println("B");
        } else if (testResult >= 70) {
            System.out.println("C");
        } else if (testResult >= 60) {
            System.out.println("D");
        } else {
            System.out.println("Un astfel de calificativ nu e definit");
        }

        System.out.println("Programul s-a terminat");
    }
}
