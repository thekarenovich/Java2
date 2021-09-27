// посчитать n + nn + nnn

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        int n = cout.nextInt();

        System.out.printf("%d + %d%d + %d%d%d = ",n,n,n,n,n,n);
        System.out.print(n*(1+11+111));
    }
}
