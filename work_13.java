//Посчитать факториал числа

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);
        System.out.println(fuck(cout.nextInt()));
    }

    static int fuck(int n){
        if(n==1)
            return 1;
        else
            return n*fuck(n-1);

    }
}
