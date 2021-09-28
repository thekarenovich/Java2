//Два целых числа от 25 до 75. Программа возвращает true, если в обоих числах есть общая цифра.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        boolean b = false;

        int n1 = cout.nextInt();
        int n2 = cout.nextInt();

        while(n1<25 || n1>75) {
            System.out.print("25 <= number 1 <= 75: ");
            n1 = cout.nextInt();
        }
        while(n2<25 || n2>75) {
            System.out.print("25 <= number 2 <= 75: ");
            n2 = cout.nextInt();
        }

        String str1 = Integer.toString(n1);
        char[] str11 = str1.toCharArray();
        String str2 = Integer.toString(n2);
        char[] str22 = str2.toCharArray();

        for(int i=0; i<str11.length; i++)
            for(int j=0; j<str22.length; j++)
                if(str11[i]==str22[j]) {
                    b = true;
                    break;
                }
        if(b)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
