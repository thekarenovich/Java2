public class Main{
      
    public static void main(String[] args) {
        
        // при объявлении объекта класса, можно его инициализировать, написав параметры в скобки
         
        Person undef = new Person(); // объект undef
        undef.displayInfo();
         
        Person tom = new Person("Tom"); // объект tom
        tom.displayInfo();
         
        Person sam = new Person("Sam", 25); // объект sam
        sam.displayInfo();
    }
}
class Person{
    
    // поля класса Person
    String name;    
    int age;        
    
    //три констуктора и метод displayInfo()
    Person()
    {
        this("Undefined", 18); // вызов третьего констуктора
    }
    
    Person(String name)
    {
        this(name, 18); // вызов третьего констуктора
    }
    
    Person(String name, int age)
    {
        //слева - поля объекта, справа - параметры конструктора
        this.name = name; 
        this.age = age;
        System.out.println("333333333333"); // для того, чтобы убедились в том, что происходит вызов третьего констуктора
    }
    
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
