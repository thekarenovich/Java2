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

interface Printable{ void print(); }


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
