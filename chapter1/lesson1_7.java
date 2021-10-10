import java.util.Scanner;

class Main{
  public static void main (String[] args){
      
    Scanner cout = new Scanner(System.in);


    // ==
    // Оператор == проверяет ссылки, а не значения
    // Это означает, что он проверяет, являются ли сравниваемые элементы одним и тем же объектом
    
    if("Java"=="Java")
        System.out.print("(1)True\n");
    else
        System.out.print("(1)False\n"); //вывовидтся
        
    String Java = cout.next(); //допустим, ввели Java
    
    if(Java=="Java")
        System.out.print("(2)True\n");
     else
        System.out.print("(2)False\n"); //вывовидтся
        
        
        
    // .equals()
    // equals проверяет исходное содержимое строки
    
    if(("Java").equals("Java"))
        System.out.print("(3)True\n"); //вывовидтся
    else
        System.out.print("(3)False\n");
        
    if(Java.equals("Java"))
        System.out.print("(4)True\n"); //вывовидтся
     else
        System.out.print("(4)False\n"); 
    
    
    
    // .equalsIgnoreCase()
    // equalsIgnoreCase проверяет исходное содержимое строки
    // независимо от регистра букв
    
    if(("JaVa").equalsIgnoreCase("JaVa"))
        System.out.print("(5)True\n"); //вывовидтся
    else
        System.out.print("(5)False\n");
        
    
    // У чисел всё проще
    
    int a = cout.nextInt();
    
    if(a==2)
        System.out.print("(6)True\n"); //вывовидтся
    else
        System.out.print("(6)False\n");
  }
}
