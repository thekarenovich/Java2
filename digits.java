import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cout = new Scanner(System.in);

        System.out.println("Введите число");

        int num = cout.nextInt();
        int dublicate = num;
        int sum = 0;
        int k = 0;

        while(dublicate>0){
            k++;
            dublicate/=10;
        }

        for (int i=0; i<k; ++i){
            sum+=num%10;
            num/=10;
        }

        System.out.print("\n"+"Количество цифр "+k);
        System.out.print("\n"+"Cумма цифр "+sum);
    }
}
