package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner cout = new Scanner(System.in);

        String str = cout.nextLine();
        int k = 0;

        for(int i=0; i<str.length(); i++){
            if(Character.isSpaceChar(str.charAt(i)))
                k++;}

        if(k != 2) {
            System.out.print("\nНекорректное выражение. Напишите по типу число_знак_число: ");
            while (k != 2) {
                str = cout.nextLine();
                k = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isSpaceChar(str.charAt(i)))
                        k++;
                }
                if(k != 2) {
                    System.out.print("\nНекорректное выражение. Напишите по типу число_знак_число: ");
                    k=0;
                }
            }
        }

        String[] array = str.split("");

        String first="";
        String sign="";
        String second="";

        int index = 0;

        while(!array[index].equals(" ")){
                first+=array[index];
                index++;
        }

        index++;
        sign = array[index];
        index+=2;

        while(index!=array.length){
            second+=array[index];
            index++;
        }

        int first_int=0;
        int second_int=0;
        int result_int=0;
        boolean f=false;


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
                first.equals("9")==false && first.equals("10")==false) {
            if (first.equals("I") == false && first.equals("II") == false && first.equals("III") == false && first.equals("IV") == false &&
                    first.equals("V") == false && first.equals("VI") == false && first.equals("VII") == false && first.equals("VIII") == false &&
                    first.equals("IX") == false && first.equals("X") == false) {
                while (first.equals("1") == false && first.equals("2") == false && first.equals("3") == false && first.equals("4") == false &&
                        first.equals("5") == false && first.equals("6") == false && first.equals("7") == false && first.equals("8") == false &&
                        first.equals("9") == false && first.equals("10") == false &&
                        first.equals("I") == false && first.equals("II") == false && first.equals("III") == false && first.equals("IV") == false &&
                        first.equals("V") == false && first.equals("VI") == false && first.equals("VII") == false && first.equals("VIII") == false &&
                        first.equals("IX") == false && first.equals("X") == false) {
                    System.out.print("Первое число нужно записать целым Aрабским либо Pимским в интервале [1,10]: ");
                    first = cout.next();
                }

                if (first.equals("1") == true || first.equals("2") == true || first.equals("3") == true || first.equals("4") == true ||
                        first.equals("5") == true || first.equals("6") == true || first.equals("7") == true || first.equals("8") == true ||
                        first.equals("9") == true || first.equals("10") == true)
                    f = false;
                else if (first.equals("I") == true || first.equals("II") == true || first.equals("III") == true || first.equals("IV") == true ||
                        first.equals("V") == true || first.equals("VI") == true || first.equals("VII") == true || first.equals("VIII") == true ||
                        first.equals("IX") == true || first.equals("X") == true)
                    f = true;

            }
            else
                f = true; // первое число - римское
        }
        else
            f = false; // первое число - арабское


       if(sign.equals("+")==false && sign.equals("-")==false && sign.equals("*")==false && sign.equals("/")==false){
            while(sign.equals("+")==false && sign.equals("-")==false && sign.equals("*")==false && sign.equals("/")==false){
                System.out.print("Допустимы знаки: +, -, *, / \n");
                sign=cout.next();
            }
        }

        if(!f)
            if(second.equals("1")==false && second.equals("2")==false && second.equals("3")==false && second.equals("4")==false &&
                second.equals("5")==false && second.equals("6")==false && second.equals("7")==false && second.equals("8")==false &&
                second.equals("9")==false && second.equals("10")==false)
                while(second.equals("1")==false && second.equals("2")==false && second.equals("3")==false && second.equals("4")==false &&
                        second.equals("5")==false && second.equals("6")==false && second.equals("7")==false && second.equals("8")==false &&
                        second.equals("9")==false && second.equals("10")==false) {
                    System.out.print("Первое число - Арабское на интервале [1,10]. Значит и второе должно быть таковым: ");
                    second = cout.next();
                }
        if(f)
            if(second.equals("I")==false &&second.equals("II")==false && second.equals("III")==false && second.equals("IV")==false &&
                second.equals("V")==false && second.equals("VI")==false && second.equals("VII")==false && second.equals("VIII")==false &&
                second.equals("IX")==false && second.equals("X")==false){
            while(second.equals("I")==false && second.equals("II")==false && second.equals("III")==false && second.equals("IV")==false &&
                    second.equals("V")==false && second.equals("VI")==false && second.equals("VII")==false && second.equals("VIII")==false &&
                    second.equals("IX")==false && second.equals("X")==false){
                System.out.print("Первое число - Римское на интервале [1,10]. Значит и второе должно быть таковым: ");
                second = cout.next();
            }
        }

        switch (first){
            case "1":
            case "I":
                first_int=1;
                break;
            case "2":
            case "II":
                first_int=2;
                break;
            case "3":
            case "III":
                first_int=3;
                break;
            case "4":
            case "IV":
                first_int=4;
                break;
            case "5":
            case "V":
                first_int=5;
                break;
            case "6":
            case "VI":
                first_int=6;
                break;
            case "7":
            case "VII":
                first_int=7;
                break;
            case "8":
            case "VIII":
                first_int=8;
                break;
            case "9":
            case "IX":
                first_int=9;
                break;
            case "10":
            case "X":
                first_int=10;
                break;
            default: System.out.print("...");
        }

        switch (second){
            case "1":
            case "I":
                second_int=1;
                break;
            case "2":
            case "II":
                second_int=2;
                break;
            case "3":
            case "III":
                second_int=3;
                break;
            case "4":
            case "IV":
                second_int=4;
                break;
            case "5":
            case "V":
                second_int=5;
                break;
            case "6":
            case "VI":
                second_int=6;
                break;
            case "7":
            case "VII":
                second_int=7;
                break;
            case "8":
            case "VIII":
                second_int=8;
                break;
            case "9":
            case "IX":
                second_int=9;
                break;
            case "10":
            case "X":
                second_int=10;
                break;
            default: System.out.print("...");
        }

        if(sign.equals("+"))
            result_int = first_int + second_int;
        else if(sign.equals("-"))
            result_int = first_int - second_int;
        else if(sign.equals("*"))
            result_int = first_int * second_int;
        else if(sign.equals("/"))
            result_int = first_int / second_int;

        //if(s!=f)
           // System.out.print("Ошибка! Оба числа не могут быть из разных систем счисления ");

        if(f==true && result_int<1)
            System.out.print("Ошибка! У римских чисел нет отрицательных значений и нуля ");

        else if(f==true && result_int>=1){
            for(int i=0; i<=100; i++){
                if (result_int == i)
                    System.out.print(first + sign + second + " = " + massiv[i]);
            }
        }
        else
            System.out.printf("%s %s %s = %d",first, sign, second, result_int);

    }
}
