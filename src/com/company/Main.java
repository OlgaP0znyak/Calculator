package com.company;

public class Main {

    public static void main(String[] args) {

		System.out.println("***КАЛЬКУЛЯТОР***");
		System.out.println();

	double number1 = Calculator.getNumber();
	char operation = Calculator.getOperation();
	double number2 = Calculator.getNumber();
	double result = Calculator.calc(number1,number2,operation);

	//System.out.println("Результат операции: " + result);
		System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
    }
}
