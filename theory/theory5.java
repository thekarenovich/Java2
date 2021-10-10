//Удаление элемента из массива

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        int array[]={1,2,3,4,5,6,4,7,8,9};
        
        //мы хотим убрать вторую 4
        //индекс его 6
        for(int i=6; i<array.length-1; i++)
            array[i]=array[i+1];
        
        for(int i=0; i<array.length-1; i++)
            System.out.print(array[i]+" ");

    }
}
