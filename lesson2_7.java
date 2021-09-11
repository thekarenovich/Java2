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
//Производный класс имеет доступ ко всем методам и полям базового класса (даже если базовый класс находится в другом пакете) 
//кроме тех, которые определены с модификатором private. 
//При этом производный класс также может добавлять свои поля и методы:

//А если написать public final class Person, то наследование не будет произведено
