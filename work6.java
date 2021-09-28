//Вывести предпоследнее слово строки 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        String str = cout.nextLine();
        int k=0;
        int kk=0;

        for(int i=0; i<str.length(); i++)
            if(Character.isSpaceChar(str.charAt(i)))
                k++;

        for(int i=0; i<str.length(); i++){
            if(Character.isSpaceChar(str.charAt(i)))
                kk++;
            if (kk == k-1)
                if (!Character.isSpaceChar(str.charAt(i)))
                    System.out.print(str.charAt(i));

        }
    }
}
