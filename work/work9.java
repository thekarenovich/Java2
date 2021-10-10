// Cоздать новую строку из 3 копий последних 3 символов исходной строки.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        String str1 = cout.next();
        String str2="";

        for(int i=str1.length()-1; i>=str1.length()-3; i--)
            str2+=str1.charAt(i);

        for(int i=2; i>=0; i--)
            for(int j=2; j>=0; j--)
                System.out.print(str2.charAt(j));
    }
}
