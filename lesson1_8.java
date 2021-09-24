//Основные методы Math

import static java.lang.Math.*;
// благодаря static b и * , можно не писать "Math. " перед каждым методом

//import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //Scanner cout = new Scanner(System.in);

        //модуль
        System.out.print("\n" + abs(-10) + " " + abs(0) + " " + abs(100) + "\n"); // 10 0 100

        //целочисленное деление
        System.out.print(floorDiv(1, 2) + " "); // 0
        System.out.print(floorDiv(7, 2) + " "); // 3
        System.out.print(Math.floorDiv(9, 2) + "\n"); // 4

        //возведение в степень
        System.out.print((int)pow(1,2) + "  "); // 1
        System.out.print(pow(2,2) + "\n"); // 4.0

        //квадратный корень
        System.out.print(sqrt(9) + " ");   // 3.0
        System.out.print(sqrt(16) + "\n");  // 4.0

        //кубический корень
        System.out.print(Math.cbrt(8) + " ");   // 2.0
        System.out.print(Math.cbrt(27) + "\n"); // 9.0

        //тригонометрия
        System.out.print(cos(PI/3) + " "); // 0.5(0)
        System.out.print((int)sin(0) + " "); // 0
        System.out.print((int)tan(0) + " "); // 0
        System.out.print(sin(toRadians(30)) + "\n"); //0.4(9)
        // и ещё asin, acos, atan

        //рандом
        //допустим, мы хотим определить интервал [0;10]
        //и хотим любые 5 числе из него
        int min=0; //начало интервала
        int max=10; //конец интервала
        for (int i = 0; i < 5; i++) {
            System.out.print((int) (random() * ((max - min) + 1)) + min);
            System.out.print(" ");
        }
        System.out.println("\n");


        //Округление

        //round округляет по правилам округления
        System.out.print((int)round(1.3) + " "); // 1
        System.out.print((int)round(1.4) + " "); // 1
        System.out.print((int)round(1.5) + " "); // 2
        System.out.print((int)round(1.6) + "\n"); // 2

        //floor(англ. пол, этаж) округляет вниз
        System.out.print((int)floor(1.3) + " "); // 1
        System.out.print((int)floor(1.4) + " "); // 1
        System.out.print((int)floor(1.5) + " "); // 1
        System.out.print((int)floor(1.6) + "\n"); // 1

        //ceil(ceiling-англ. потолок) округляет вниз
        System.out.print((int)ceil(1.3) + " "); // 2
        System.out.print((int)ceil(1.4) + " "); // 2
        System.out.print((int)ceil(1.5) + " "); // 2
        System.out.print((int)ceil(1.6) + "\n\n"); // 2
        
        //логарифм
        //метод для натурального алгоритма
        //но если вспомнить формулу для оснований, то можно самому определять число и основание
        System.out.print((int)(Math.log(64)/Math.log(2)) + "\n");
        
    }
}
