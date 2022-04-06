package com.company;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        /*😁 просто для зелёного чекбокса на сайте сделал 😁*/
        char s = 's';
        byte aByte = 5;
        short aShort = 10;
        int aInt = 17;
        long aLong = 100000;
        float aFloat = 4.8123F;
        double aDouble = 123.321D;
        String hope = "Надеюсь стану аутотестером ☝️";

        System.out.println("Результат сложения " + aByte + " и " + aInt + " = " + sum(aByte, aInt));
        System.out.println("Результат вычитяния " + aByte + " из " + aInt + " = " + diff(aInt, aByte));
        System.out.println("Результат умножения " + aShort + " на " + aByte + " = " +  multiplication(aShort, aByte));
        System.out.println("Результат деления " + aLong + " на " + aByte + " = " + divide((int) aLong, aByte)); //специально кастанул long в int
        System.out.println("Остаток от деления " + aInt + " на " + 10 + " = " + modulo(aInt, 10));

        System.out.println("Результат сложения " + aFloat + " и " + aDouble + " = " + sum(aFloat, aDouble));

        aByte++;
        System.out.println("\n" + "aByte стал больше на 1 единицу - " + aByte);

        aByte--;
        System.out.println("\n" + "aByte стал меньше на 1 единицу - " + aByte);

        //Никаких ошибок не будет, т.к переполнения не происходит, aByte помещается в aInt
        aInt = aByte;
        System.out.println("\n" + "Переменная aInt стала равна aByte - " + aInt);

        //чтобы мы смогли aByte присвоить aInt, то нужно кастануть aInt в byte, чтобы оно обрезалось и поиместилось в aByte
//        aByte = aInt
//        System.out.println();
        System.out.println(hope.toUpperCase()); //Строка капсом
    }

    static int sum(int a, int b) {
        return a + b;
    }
    static int diff(int a, int b) {
        return a - b;
    }
    static int multiplication(int a, int b) {
        return a * b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
    static int modulo(int a, int b) {
        return a % b;
    }

    //перезагруженные
    static double sum(double a, double b) {
        return a + b;
    }
    static double diff(double a, double b) {
        return a - b;
    }
    static double multiplication(double a, double b) {
        return a * b;
    }
    static double divide(double a, double b) {
        return a / b;
    }
    static double modulo(double a, double b) {
        return a % b;
    }

}
