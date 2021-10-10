public class Main{
      
    public static void main (String args[]){
          
        hello();
        welcome();
        
        int a = 6;
        int b = 8;
        sum(a, b);  // 14
        sum(3, a);  // 9
        
        sum2("Welcome!", 20,10);
        sum2("Hello World!");
        
        System.out.println(sum3(1,2,3)); //печать возращаемого значения функции
        
        aaa(100);
        
    }
    
    static void hello(){
         
        System.out.println("Hello");
    }
    static void welcome(){
         
        System.out.println("Welcome to Java 10");
        hello();
    }
    
    static void sum(int x, int y){
         
        int z = x + y;
        System.out.println(z);
    }
    
    static void sum2(String message, int ...nums){
         
        System.out.println(message);   
        int result =0;
        for(int x:nums)
            result+=x;
        System.out.println(result);
    }
    
    static int sum3(int a, int b, int c){
        
        return a + b + c;
    }
    
    static void aaa(int a){
         
        if (a >24 || a < 0){
            System.out.println("выход");
            return; //ВЫХОД ИЗ МЕТОДА
        }
        else
            System.out.println(a+5);
}
}

//по умолчанию выполняется метод main 
//определили ещё методы, но без вызова они не работают
//поэтому вызываем в любом созданном методе
//троеточие перед названием параметра int ...nums указывает на то, что он будет необязательным и будет представлять массив. 
//мы можем передать в метод sum одно число, несколько чисел, а можем вообще не передавать никаких параметров. 
//функция если не типа void, то она должна возращать значение
//тип значения должен совпадать с типо функции 

