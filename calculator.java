package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner cout = new Scanner(System.in);

        System.out.print("Введите выражение(число знак число): ");

        String first=cout.next();
        String sign=cout.next();
        String second=cout.next();

        int first_int=0;
        int second_int=0;
        int result_int=0;
        boolean f = false;
        boolean s = false;

        String massiv[] = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        if(first.equals("1")==false && first.equals("2")==false && first.equals("3")==false && first.equals("4")==false &&
            first.equals("5")==false && first.equals("6")==false && first.equals("7")==false && first.equals("8")==false &&
            first.equals("9")==false && first.equals("10")==false &&
                first.equals("I")==false && first.equals("II")==false && first.equals("III")==false && first.equals("IV")==false &&
                first.equals("V")==false && first.equals("VI")==false && first.equals("VII")==false && first.equals("VIII")==false &&
                first.equals("IX")==false && first.equals("X")==false){

            while (first.equals("1")==false && first.equals("2")==false && first.equals("3")==false && first.equals("4")==false &&
                    first.equals("5")==false && first.equals("6")==false && first.equals("7")==false && first.equals("8")==false &&
                    first.equals("9")==false && first.equals("10")==false &&
                    first.equals("I")==false && first.equals("II")==false && first.equals("III")==false && first.equals("IV")==false &&
                    first.equals("V")==false && first.equals("VI")==false && first.equals("VII")==false && first.equals("VIII")==false &&
                    first.equals("IX")==false && first.equals("X")==false){
                System.out.print("Первое число нужно записать целым арабским либо римским в интервале [1,10]: ");
                first = cout.next();
            }
        }

        if(sign.equals("+")==false && sign.equals("-")==false && sign.equals("*")==false && sign.equals("/")==false){

                while(sign.equals("+")==false && sign.equals("-")==false && sign.equals("*")==false && sign.equals("/")==false){
                    System.out.print("Допустимы знаки: +, -, *, / \n");
                    sign=cout.next();
                }
            }

        if(second.equals("1")==false && second.equals("2")==false && second.equals("3")==false && second.equals("4")==false &&
                second.equals("5")==false && second.equals("6")==false && second.equals("7")==false && second.equals("8")==false &&
                second.equals("9")==false && second.equals("10")==false &&
                second.equals("I")==false &&second.equals("II")==false && second.equals("III")==false && second.equals("IV")==false &&
                second.equals("V")==false && second.equals("VI")==false && second.equals("VII")==false && second.equals("VIII")==false &&
                second.equals("IX")==false && second.equals("X")==false){

            while(second.equals("1")==false && second.equals("2")==false && second.equals("3")==false && second.equals("4")==false &&
                    second.equals("5")==false && second.equals("6")==false && second.equals("7")==false && second.equals("8")==false &&
                    second.equals("9")==false && second.equals("10")==false &&
                    second.equals("I")==false &&second.equals("II")==false && second.equals("III")==false && second.equals("IV")==false &&
                    second.equals("V")==false && second.equals("VI")==false && second.equals("VII")==false && second.equals("VIII")==false &&
                    second.equals("IX")==false && second.equals("X")==false){
                System.out.print("Второе число нужно записать целым арабским либо римским в интервале [1,10]: ");
                second = cout.next();
            }
        }

        switch (first){
            case "1":
                first_int=1;
                break;
            case "I":
                first_int=1;
                f=true;
                break;
            case "2":
                first_int=2;
                break;
            case "II":
                first_int=2;
                f=true;
                break;
            case "3":
                first_int=3;
                break;
            case "III":
                first_int=3;
                f=true;
                break;
            case "4":
                first_int=4;
                break;
            case "IV":
                first_int=4;
                f=true;
                break;
            case "5":
                first_int=5;
                break;
            case "V":
                first_int=5;
                f=true;
                break;
            case "6":
                first_int=6;
                break;
            case "VI":
                first_int=6;
                f=true;
                break;
            case "7":
                first_int=7;
                break;
            case "VII":
                first_int=7;
                f=true;
                break;
            case "8":
                first_int=8;
                break;
            case "VIII":
                first_int=8;
                f=true;
                break;
            case "9":
                first_int=9;
                break;
            case "IX":
                first_int=9;
                f=true;
                break;
            case "10":
                first_int=10;
                break;
            case "X":
                first_int=10;
                f=true;
                break;
            default: System.out.print("haha1");
        }

        switch (second){
            case "1":
                second_int=1;
                break;
            case "I":
                second_int=1;
                s=true;
                break;
            case "2":
                second_int=2;
                break;
            case "II":
                second_int=2;
                s=true;
                break;
            case "3":
                second_int=3;
                break;
            case "III":
                second_int=3;
                s=true;
                break;
            case "4":
                second_int=4;
                break;
            case "IV":
                second_int=4;
                s=true;
                break;
            case "5":
                second_int=5;
                break;
            case "V":
                second_int=5;
                s=true;
                break;
            case "6":
                second_int=6;
                break;
            case "VI":
                second_int=6;
                s=true;
                break;
            case "7":
                second_int=7;
                break;
            case "VII":
                second_int=7;
                s=true;
                break;
            case "8":
                second_int=8;
                break;
            case "VIII":
                second_int=8;
                s=true;
                break;
            case "9":
                second_int=9;
                break;
            case "IX":
                second_int=9;
                s=true;
                break;
            case "10":
                second_int=10;
                break;
            case "X":
                second_int=10;
                s=true;
                break;
            default: System.out.print("haha1");
        }

        if(sign.equals("+"))
            result_int = first_int + second_int;
        else if(sign.equals("-"))
            result_int = first_int - second_int;
        else if(sign.equals("*"))
            result_int = first_int * second_int;
        else if(sign.equals("/"))
            result_int = first_int / second_int;

        if(s!=f)
            System.out.print("Ошибка! Оба числа не могут быть из разных систем счисления ");

        else if(s==true && f==true && result_int<1)
            System.out.print("Ошибка! У римских чисел нет отрицательных значений и нуля ");

        else if(s==true && f==true && result_int>1){
            for(int i=0; i<=100; i++){
                if (result_int == i)
                    System.out.print(first + sign + second + " = " + massiv[i]);
            }
        }
        else
            System.out.printf("%s %s %s = %d",first, sign, second, result_int);
    }
}
