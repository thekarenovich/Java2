import java.util.Scanner; // импорт класса Scanner из пакета util
// import java.util.*; // импорт всего пакета util

import static java.lang.System.*;
import static java.lang.Math.*;
//В java есть также особая форма импорта - статический импорт. Для этого вместе с директивой import используется модификатор static
/*Здесь происходит статический импорт классов System и Math. Эти классы имеют статические методы. 
Благодаря операции статического импорта мы можем использовать эти методы без названия класса. 
Например, писать не Math.sqrt(20), а sqrt(20), так как функция sqrt(), которая возвращает квадратный корень числа, является статической.
То же самое в отношении класса System: в нем определен статический объект out, поэтому мы можем его использовать без указания класса.*/
 
public class Main {
 
    public static void main(String[] args) {
        
        Scanner vvod = new Scanner(in); 
        
        double result = sqrt(20);
        out.println(result);
         
        // Scanner vvod = new Scanner(System.in); 
        // Писали бы так, если бы не статический импорт 
    } 
}
