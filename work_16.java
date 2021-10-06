// Проверить наличие строки в строке

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        String str = "Pythonyth";
        String ministr = "ythythyth";
        boolean b = true;

        if (str.length() > ministr.length()) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ministr.charAt(0) && i+ministr.length() < str.length())  {
                    b = true;
                    for (int j = 0; j < ministr.length(); j++)
                        if(ministr.charAt(j) != str.charAt(i + j)) {
                            b = false;
                            break;
                        }
                    if(b) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }

        else
            System.out.println("Такой строки нет");


        if(!b)
            System.out.println("Такой строки нет");
    }
}


