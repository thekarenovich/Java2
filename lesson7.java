//класс - создание нового типа данных
//чтобы определить два класса в одном файле, в нём должен быть лишь один класс public 
//а именно тот, под которым записано название файла

public class Main{
      
    public static void main(String[] args) {
         
        Person1 tom = new Person1(); // создание объекта (или экземемпляра класса)
        //по умолчанию у объекта поля своего класса значения по нулю
        tom.displayInfo();

        tom.name = "Tom";
        tom.age = 34;
        tom.displayInfo();
        
        for(int i=0; i<2; i++)
            System.out.println();
        
        Person2 bob = new Person2();      // вызов первого конструктора без параметров
        bob.displayInfo();
         
        Person2 sam = new Person2("Sam"); // вызов второго конструктора с одним параметром
        sam.displayInfo();
         
        Person2 john = new Person2("John", 25); // вызов третьего конструктора с двумя параметрами
        john.displayInfo();
    }
}

//в Person1 нет конструктора 
class Person1{
     
    String name;
    int age;     
    
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
    
// в Person2 аж три конструктора
class Person2{
     
    String name;  
    int age;        
    
    Person2(){
        name = "Undefined";
        age = 18;
    }
    
    Person2(String n){
        name = n;
        age = 18;
    }
    
    Person2(String n, int a){
        name = n;
        age = a;
    }
    
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
