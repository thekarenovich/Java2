//Вставка элемента в массив

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cout = new Scanner(System.in);

        int array[]={1,2,3,5,6,7,8,9};
        int array1[] = new int[9];
        
        //присвоение исходного, потому что длина второго чуть больше
        //а нам и нужно 9 элементов,а не 8, ибо будет добавление
        for(int i=0; i<array.length; i++)
            array1[i]=array[i];

        //мы хотим добавить вторую 4
        //индекс его 6
        for(int i=array1.length-1; i>3; i--)
            array1[i]=array1[i-1];
        array1[3]=4;

        for(int i=0; i<array1.length; i++)
            System.out.print(array1[i]+" ");

    }
}
