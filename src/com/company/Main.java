package com.company;

public class Main {

    public static void main(String[] args) {
	int questions = 0;
    String quesno;
    switch (questions) {
            case 1: quesno = "Why are we here?";
            break;
            case 2: quesno = "Where are we going?";
            break;
            case 3: quesno = "What time is it?";
            break;
            case 4: quesno = "How do we fix it?";
            break;
            case 5: quesno = "Which game are we playing?";
            break;
            case 6: quesno = "How do we get here?";
            break;
            default: quesno = "How much longer?";
            break;
        }
        System.out.println(quesno);
    }
}
