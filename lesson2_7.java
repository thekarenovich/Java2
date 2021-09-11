public class Main{
      
    public static void main(String[] args) {
             
        Person tom = new Person();
        tom.fun();
        Employee sam = new Employee();
        sam.fun();
        sam.fun2();
    }
}
class Person {
    
    public void fun(){
        System.out.println("Persoooon"); }
}

class Employee extends Person{ 
    
    //наследованное содержание Person в Employee
    
    public void fun2(){
        System.out.println("Eeeeeeeeee"); }
    
}
