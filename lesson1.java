import java.lang.String; // импортироваине класса String
import java.util.Scanner; // импортироваине класса Scanner

public class Main{ //класс Main (главный класс, т.к. в нём главная функция в коде)

	public static void main(String[] massiv) { //функция main (главная функция)

		byte var1;
		short var2 = 2;
		int var3 = 300;
		long var4 = 444444;

		float var5 = 5.9f;
		double var6 = 90.2932d;
		// в конце значений переменных типа float или double писать f или d

		char var7 = 'a';
		boolean var8 = true;
		boolean var9 = false;

		final int var10 = 5; //константа типа int Опеределили её ключ. словом final

		//var var11 = 10; // неопр тип данных
		/*
		так писать нельзя, т.к. тип данных не опр
		var x;
		x = 10;
		*/

		String str = "Hello, world!";

		System.out.println(str);

		Scanner obj = new Scanner(System.in); // создание объекта для ввода(ов)

		System.out.println("Your string: " + obj.nextLine()); // вывод ввода строки
		// обратите внимание, что при выводе System.out, при вводе - System.in

		int var12 = obj.nextInt(); //ввод числа

		//next(): считывает введенную строку до первого пробела
		//nextLine(): считывает всю введенную строку
		//nextInt(): считывает введенное число int
		//nextDouble(): считывает введенное число double
		//nextBoolean(): считывает значение boolean
		//nextByte(): считывает введенное число byte
		//nextFloat(): считывает введенное число float
		//nextShort(): считывает введенное число short

		System.out.printf("digit=%d letter=%c", var12, var7); //формативная запись, поэтому пишем printf
		//%d: для вывода целового числа
		//%f: для вывода чисел с плавающей точкой
		//%c: для вывода одиночного символа
		//%s: для вывода строковых значений
		}
		}

		// точка с запятой (;) - конец строки
		// внутри скобок пишутся команды функции, класса и т.д.
		// комментарии, как в с++ : // и /*...*/
		// функиця print - печать
		// функция println - печать с новой строки
		// 1 строка - класс
		// 3 строка - это функция main