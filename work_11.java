// n - целое число
// разделите n на 2, если n четное, или умножьте на 3, и добавьте 1, если n нечетное, повторяйте процесс до n = 1.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        int n = cout.nextInt();
        int k = 0;

        while(n!=1){
            if(n%2==0) {
                k++;
                System.out.printf("%d: %d/2 \n", k, n);
                n = n / 2;
            }
            else
                if(n%2==0) {
                    k++;
                    System.out.printf("%d: %d/3 \n", k, n);
                    n = n / 3;
                }
                else{
                    k++;
                    System.out.printf("%d: %d-1 \n", k, n);
                    n = n - 1;
                }

            }
    }
}
