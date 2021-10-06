// Вывод первого уникальног символа в строке 

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean b;
        int index = -1;

        String str = "xxzjlzlaxj";
        String sarray[] = str.split("");

        for(int i = 0; i < sarray.length; i++) {
            b = true;
            for (int j = 0; j < sarray.length; j++) {
                if (i != j && sarray[i].equals(sarray[j])){
                    b = false;
                    break;
                }
            }
            if(b) {
                System.out.print(sarray[i] + " " + i);
                break;
            }
        }
    }
}


