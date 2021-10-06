import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        String num = cout.next();
        int num1 = Integer.parseInt(num);
        int k = 0;
        boolean b = true;

        while (num1 > 0) {
            num1/=10;
            k++;
        }

        for(int i=0; i<k; i++){
            if(num.charAt(i)!=num.charAt(k-1-i)){
                b=false;
                break;
            }
        }

        if(b)
            System.out.printf("Число %s  - полиндром", num);
        else
            System.out.printf("Число %s  - НЕ полиндром", num);

    }
}


