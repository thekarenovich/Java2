package com.company;

public class Main {

    public static void main(String[] args) {

        //Про сравнение строк написано в lesson1_7
        
        //Строчные и прописные буквы
        System.out.println("Hello World".toLowerCase());
		System.out.println("Hello World".toUpperCase());

        //Сложение строк
        String day = "День";
        String and = "и";
        String night = "Ночь";
        String dayAndNight = "\n" + day + " " + and + " " + night;
	// объединить строки можно ещё так:
	    // String str1 = "Java";
	    // String str2 = "Hello";
	    // str2 = str2.concat(str1); // HelloJava
	    // или так
	    // String str3 = String.join(" ", str2, str1); // Hello Java
        System.out.println(dayAndNight);

        //toString
        Human max = new Human("Макс");
        String out = "\nJava объект: " + max;
        // max.toString() - можно записать и так объект
        // Каждый класс в Java является дочерним классом для класса Object.
        // Класс Object содержит метод toString().
        // Он используется для получения строкового представления объекта.
        System.out.println(out);
        // Вывод: Java объект: Человек с именем Макс

        //Преобразование значений в строку
        // из int или другого типа данных в char
        // это работа с таблицей ASCII
        System.out.println( "\n" + (int)('a') ); // 97
        System.out.println( (char)(120) ); // x

        //А мы хотим, чтобы, допустим 97, было строкой, а не числом
        System.out.println(String.valueOf(97) + " - это строка ))"); // 97 - это строка ))
        // или так
        System.out.println(Double.toString(12.55) + " - это строка :3"); // 12.55 - это строка :3

        // Преобразование строк в другие типы данных
        int i = Integer.parseInt("12");
        double d = Double.parseDouble("12.65");
        boolean b = Boolean.parseBoolean("true");
        System.out.println(i+d + " " + b);
        }

        //split(String regex) - разбиение строки на строковый массив
        String people = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth; Hermes Conrad; John D. Zoidberg; Amy Wong";
        String[] peopleArray = people.split("; ");

            System.out.print(people + "\n\n"); // вывод строки

            for (String human : peopleArray) { // вывод построенного массива
            System.out.println(human);
        }
            
        //Определение индекса символа в строке
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet.indexOf('A')); // 0
        System.out.println(alphabet.indexOf('K')); // 10
        System.out.println(alphabet.indexOf('Z')); // 25
        System.out.println(alphabet.indexOf('Я')); // -1
    
    
         //Преобразование строки в строчный массив 
         char[] result = alphabet.toCharArray();
         for (int i = 0; i < result.length; i++)
            System.out.println("Element [" + i + "]: " + result[i]);
	
	//Замена строки
	String sss = "Hello world";
	String replStr1 = sss.replace('l', 'd'); // Heddo wordd
	String replStr2 = sss.replace("Hello", "Bye"); // Bye world
	
	//Обрезка строки
	String ss = "Hello world";
	String substr1 = ss.substring(6); // world
	String substr2 = ss.substring(3,5); //lo

   
            
    //класс Human для примера 2
    static class Human {
        private String name;
        public Human(String name) { this.name = name; }
        @Override // переопределение метода
        // его необязательно писать
        public String toString() {
            return "Человек с именем " + name;
        }
    }
}
