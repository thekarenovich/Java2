// Вывести уникальные по цифрам 1-4 трёхзначные числа
// И посчитать их общее количество 

public class Main {
    public static void main(String[] args) {

        int k = 0;

        for(int i=123; i<=432; i++){
            String str = Integer.toString(i);
            char[] array = str.toCharArray();

            if(array[0]=='1' || array[0]=='2' || array[0]=='3' || array[0]=='4')
                if((array[1]=='1' || array[1]=='2' || array[1]=='3' || array[1]=='4') && array[1]!=array[0])
                    if((array[2]=='1' || array[2]=='2' || array[2]=='3' || array[2]=='4') && array[2]!=array[0] && array[2]!=array[1]) {
                        for (int j = 0; j < array.length; j++)
                            System.out.print(array[j]);
                        k++;
                        System.out.print("\n");
                    }
        }
        System.out.println("Общее количество: " + k);
    }
}
