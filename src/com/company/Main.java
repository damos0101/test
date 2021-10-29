package com.company;

public class Main {

    public static void main(String[] args) {
	    Number number = new Number();
        System.out.println("result = " + number.result(2.5));
        number.changeType();
        number.add();
        number.infinity();
        number.notANumber();
        number.mathematics();
    }
}
