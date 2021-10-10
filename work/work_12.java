// Определить, является ли число степенью 4-ки
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        int n = cout.nextInt();
        int nn = n;
        int k = 0;

        if(n%4==0) {
            while (n > 1) {
                n /= 4;
                k++;
            }
            if(n==1)
                System.out.printf("Является. %d = 4^%d \n", nn,k);
            else if(n<1)
                System.out.println("Не является");

        }
        else if(n==1)
            System.out.printf("Является. %d = 4^%d \n", n,0);
        else
            System.out.println("Не является");
    }
}
