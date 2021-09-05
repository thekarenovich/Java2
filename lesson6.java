public class Main{
      
    public static void main (String args[]){
          
         hello();
         welcome();
         welcome();
    }
    static void hello(){
         
        System.out.println("Hello");
    }
    static void welcome(){
         
        System.out.println("Welcome to Java 10");
        hello();
    }
}

//по умолчанию выполняется метод main 
//определили ещё два метода, но без вызова они не работают
//поэтому вызываем в любом созданном методе
