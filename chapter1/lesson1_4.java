
public class Main{

	public static void main(String[] massiv){
	    
	    for (int i = 1; i <= 3; i++){
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }
        
        int i = 1;
        for (; i<3;){
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
            i++;
        }
        
        for(int i=0, j=10; i < j; i++, j--){
            System.out.println(i + "  " + j);
        }
        //действие цикла for перестаёт выполняться до того, как условие нарушится
        //дескать в данном случае, когда i и j по 5, печать не выполняется



        i = 7;
        do{
            System.out.println(j);
            i--;
        }
        while (i > 0);
        //результат вывод чисел от 7 до 1
        //фишка do while в том, что сначала выполняется действие, затем проверка по условию



        i = 6;
        while (i > 0){
            System.out.println(i);
            i--;
        }
        //результат вывод чисел от 6 до 1
        //while же проверяет сначала, затем совершает дейсвтие



        for (int i = 0; i < 10; i++){
            if (i == 5)
                break;
            System.out.println(i);
        }
        //результат вывод чисел от 0 до 4
        //break прерывает работу цикла


        for (int i = 0; i < 10; i++){
            if (i == 5)
                continue;
                System.out.println(i);
        }
        //результат вывод чисел от 0 до 9, кроме цифры 5
        //continue пропускает действие цикла и переходит к следующему значению
                    
	}
}	

