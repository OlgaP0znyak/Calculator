package com.company;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static double getNumber(){
        double number;
        System.out.println("Введите число:");
        if(scanner.hasNextDouble()){
            number = scanner.nextDouble();
        } else {
            System.out.println("Ошибка. Повторите ввод. ");
            scanner.next();
            number = getNumber();
        }
        return number;
    }

    public static char getOperation(){
        String inputedString;
        char operation;
        System.out.println("Выберите операцию (+, -, *, /): ");

        inputedString = scanner.next();
        if (inputedString.equals("+") || inputedString.equals("-") ||
                inputedString.equals("*") || inputedString.equals("/"))
        operation = inputedString.charAt(0);
        else {
            System.out.println("Ошибка. Повторите ввод. ");
            operation = getOperation();
        }
        return operation;
    }

    public static double calc(double number1, double number2, char operation){
        double result = 0;
        switch (operation){
            case '+':
                result = number1+number2;
                break;
            case '-':
                result = number1-number2;
                break;
            case '*':
                result = number1*number2;
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("Деление на 0 невозможно. Введите другой делитель. ");
                    number2 = getNumber();
                    result = calc(number1,number2,operation);
                }
                else
                    result = number1/number2;

                break;
        }
        return result;
    }
   }