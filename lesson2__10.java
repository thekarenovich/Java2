/*
Интерфейсы, по-сути, почти те же абстрактные классы, но у них немного больше удобств
Интерфейс не имеет типа данных, модификатора доступа, статики, абстракции
Перед названием пишем лишь его слово interface
Интерфейс определяет методы и константы, не поля, как переменные
Методы интерфейса по-умолчанию public, писать его не надо
Они могут private, но тогда использовать можно их лишь внутри интерфейса
Методы у интерфейса могут иметь, могут не иметь реализации
Класс наследует интерфейс, тогда он должен реализовать или переопределить все методы,
кроме методов по-умолчанию(default)
Чтобы класс реализовал интерфейс, нужно написать после названия implements
*/

public class Main{
      
    public static void main(String[] args) {
             
        Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();

        WaterPipe pipe = new WaterPipe();
        pipe.printState(1);

        //Мы не можем напрямую создавать объекты интерфейсов, как так:
        //Printable pr = new Printable();
        //pr.print();

        //Но можем так:
        //Printable b1 = new Book("Java. Complete Referense.", "H. Shildt");
        //b1.print();
        //Как с родительским классом и дочерним
        //И также допустимо нисходящее преобразование

    }
}

interface Printable{ 

    void print(); 

    //метод по умолчанию
    //его необязательно использовать в дочерних классах
    default void print2(){
         
        System.out.println("Undefined printable");
    }
}

interface Stateable{ 

    //константы
    //они не имеют по умолчанию модификатор доступа public static final
    int OPEN = 1;
    int CLOSED = 0;

    }

/*
Множественная реализация интерфейсов
Если, допустим, класс Book захочет реализовать сразу два интерфейса
Например, два верхних, то писать нужно так:
class Book implements Printable, Searchable {}
*/



/*
Наследование интерфейсов
Интерфейсы, как и классы, могут наследоваться:
interface BookPrintable extends Printable {}
*/


/*
Вложенные интерфейсы
Как и классы, интерфейсы могут быть вложенными
То есть могут быть определены в классах или других интерфейсах. Например:

class Printer{
    interface Printable {
     
        void print();
    }
}

При применении такого интерфейса нам надо указывать его полное имя вместе с именем класса:

public class Journal implements Printer.Printable {
 
    String name;
  
    Journal(String name){
          
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }  
}

Использование интерфейса будет аналогично предыдущим случаям:

Printer.Printable p =new Journal("Foreign Affairs");
p.print();
*/


class Book implements Printable{
  
    String name;
    String author;
  
    Book(String name, String author){
          
        this.name = name;
        this.author = author;
    }
      
    public void print() {
      
        System.out.printf("%s (%s) \n", name, author);
    }

}

class WaterPipe implements Stateable{
     
    public void printState(int n){
        if(n==OPEN)
            System.out.println("Water is opened");
        else if(n==CLOSED)
            System.out.println("Water is closed");
        else
            System.out.println("State is invalid");
    }
}
