import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        int k=0; // должен быть 100 в конце
        int listt[] = new int[100]; // массив для чисел
        int n=2; // числа
        boolean b = true;
        int s=0; //cумма простых чисел

        while(1!=0) {
            if (k < 100) {
                b = true;
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0 && i != 1 && i != n) {
                        n++;
                        b = false;
                    }
                }
                    if(b){
                        listt[k] = n;
                        k++;
                        n++;
                    }
            }
            else break;
        }

        for(int i=0; i<listt.length; i++)
            s+=listt[i];
        
        System.out.print(s);
    }
}
