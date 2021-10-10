public class Main{
      
    public static void main(String[] args) {
             
        Person kate = new Person("Kate"); // создание объекта(вызов конструктора)
        System.out.println(kate.getName()); // вывод: Kate
        changeName(kate); //передача объекта методу changeName
        System.out.println(kate.getName()); // вывод: Alice
    }
    
    static void changeName(Person p){
        p.setName("Alice");
        //kate.setName("Alice"); - то же самое
    }
}
class Person{
      
    private String name;
 
    Person(String name){
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
     
        return this.name;
    }
}
