// Перемножить поэлементно два массива 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        int array1[] = {1,2,3,4};
        int array2[] = {1,2,3,4};

        for(int i=0; i<array1.length; i++)
            System.out.print(array1[i]*array2[i] + " ");
    }
}
