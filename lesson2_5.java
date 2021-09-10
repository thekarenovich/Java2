// статическое поле или метод: к нему можно обращаться через имя класса, а его фишка в том, что он общий на всех
// прототип глобальной переменной в python
// для всех объектов сейчас поле counter общее
// в статическом методе статическое поле


import java.lang.System.*;

public class Main{
      
    public static void main(String[] args) {
         
        Person tom = new Person(); //вызов конструтокра
        Person bob = new Person(); //вызов конструтокра
        
        tom.displayId();
        bob.displayId();
        System.out.printf("Main: %d \n", tom.counter); 
        System.out.printf("Main: %d \n", Person.counter);
         
        // изменяем Person.counter
        Person.counter = 8;
        
        System.out.printf("Main: %d \n", bob.counter); 
        
        Person sam = new Person(); //вызов конструтокра
        sam.displayId();
        
        System.out.printf("Main: %d \n", sam.counter); 
        
    }
}
class Person{
    
    public static int counter=1;
     
    Person(){
        counter++;
    }
    
    public static void displayId(){
     
        System.out.printf("Person: %d \n", counter);
    }
}
