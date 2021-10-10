import java.lang.String;

public class Main{

	public static void main(String[] massiv){

		int a = 10;
		int b = 4;
		double c;
		c = 10.0;

		int d = a+b; //14
		int e = a-b; //6
		int f = a*b; //40
		int g = a/b; //2
		double h = a/b; //2.000000
		//h выдаёт целое значение, хоть сам и double, т.к. a,b - целые
		// хотя бы один из них должен быть числом с плавающей точкой
		double m = c/b; //2.500000
		int n = a%b; // (деление с остатком)

		a++; //11 (a+=1)
		++a; //12 (a+=1)
		a--; //11 (a-=1)
		--a; //10 (a-=1)

		System.out.printf("%d\n" + "%d\n" + "%d\n" + "%d\n" + "%f\n" + "%f\n" + "%d\n" + "%d\n",d,e,f,g,h,m,n,a);

		boolean t = a == b; // false
		boolean t_t = a == 10; // true
		System.out.println(t + " " + t_t);
		t = a != b;   
		System.out.println(t);
		t = a < b;
		t_t = a > b;
		System.out.println(t + " " + t_t);
		t = a <= b;
		t_t = a >= b;
		System.out.println(t + " " + t_t);
		
		/*
		c=a|b; (c равно true, если либо a, либо b (либо и a, и b) равны true, иначе c будет равно false)
		c=a&b; (c равно true, если и a, и b равны true, иначе c будет равно false)
		c=!b; (c равно true, если b равно false, иначе c будет равно false)
		c=a^b; (c равно true, если либо a, либо b (но не одновременно) равны true, иначе c будет равно false)
		c=a||b; (c равно true, если либо a, либо b (либо и a, и b) равны true, иначе c будет равно false)
		c=a&&b; (c равно true, если и a, и b равны true, иначе c будет равно false)
		*/

		int sum = 'a' + 5;
		System.out.println((int)(5.099)); //5
		System.out.println((double)(5)); //5.0
		System.out.println((int)('a')); //97 (по таблице ASCII)
		System.out.println((char)(98)); //b (по таблице ASCII)
		System.out.println(sum); //102 (97+5)
	
	}
}
