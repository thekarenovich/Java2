//Абстрактный класс - что-то вроде шаблона, инструкции. В нём пишется функционал, но к нему нельзя обратиться
//Он предназначен для дочерних классов
//Также и абстрактный метод: к нему нельзя обратиться, да и функционал не записать в нём
//Но можно написать название, модификатор доступа и т.д. данного метода и уже потом его дополнить в классах-наследников
//Но главное отличие состоит в том, что мы не можем использовать конструктор абстрактного класса для создания его объекта. 
//Также следует учитывать, что если класс имеет хотя бы один абстрактный метод, то данный класс должен быть определен как абстрактный.

public class Main{
      
    public static void main(String[] args) {
             
        Employee sam = new Employee("Sam", "Leman Brothers");
        //Person sam = new Employee("Sam", "Leman Brothers");
        //можно было бы писать и так, т.к. Employee - наследник Person
        //но нельзя сейчас, т.к. Person - абстрактный класс, от него нельзя создать объект
        sam.display();
    }
}
abstract class Person {
     
    private String name;
     
    public String getName() { 
        
        return name; 

    }

    public Person(String name){
     
        this.name=name;
    }
  
    public abstract void display();
}
 
class Employee extends Person{
 
    private String bank;
     
    public Employee(String name, String company) {
     
        super(name);
        bank = company;
    }
     
    public void display(){
         
        System.out.printf("Employee Name: %s \t Bank: %s \n", this.getName(), bank);
    }
}
