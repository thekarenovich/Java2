
public class Main{

	public static void main(String[] massiv){
	    
	    //массивы также ограничены одним типом данных
	    //дескать, если массив, допустим, целочисленный, то все его члены - целые
	
        //два типа объявления пустого массива:
        int massiv1[];
        int[] massiv2;
        
        //исходная длина массива:
        int massiv3[] = new int[4]; // массив из 4 чисел
        int[] massiv4 = new int[5]; // массив из 5 чисел
        massiv1 = new int[4];  // массив из 4 чисел
        
        //инициализация массива: 
        int[] m1 = new int[] { 1, 2, 3, 5 };
        int[] m2 = { 1, 2, 3, 5 };
        int m3[] = { 1, 2, 3, 5 };
        massiv1[0] = 1;
        massiv1[1] = 2;
        massiv1[2] = 4;
        massiv1[3] = 100;
        
        //определение длинны массива:
        int length = massiv.length; // 4
        
        //матрица (двумерный массив):
        int[][] mm1 = { { 0, 1, 2 }, { 3, 4, 5 } };
        int mm2[][] = { { 0, 1, 2 }, { 3, 4, 5 } };
        int mm3[][] = new int[2][2];
        mm3[0][0]=0;
        mm3[0][1]=1;
        mm3[1][0]=10;
        mm3[1][1]=11;

        //перебор элементов массива:
        int[] array = new int[] { 1, 2, 3, 4, 5 };

        for (int i : array){  

            System.out.println(i);
        }

        System.out.println();
        
        //перебор элементов матрицы:
        int[][] nums = new int[][] 
        { 
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 0; i < nums.length; i++){
            for(int j=0; j < nums[i].length; j++){
                     
                System.out.printf("%d ", nums[i][j]);
            }
            System.out.println();
        }
        
        }
}	

