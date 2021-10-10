
// Нахождение значения в матрице

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //размер матрицы 2х3
        int[][] matrix = { { 0, 4, 8 }, { 10, 3, 4 } };
        //само число
        int num = 4;

        for(int i=0; i<2; i++)
            for(int j=0; j<3; j++)
                if(matrix[i][j]==num)
                    System.out.printf("Индексы числа %d - %d%d \n", num, i,j);

    }
}

