import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<String>();
        
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");

        for(String person : people){
            System.out.println(person);
        }
        System.out.println();

        people.add(1, "Bob"); // добавляем элемент по индексу 1
        // первым был Alice, но его сдвинули, НЕ ЗАМЕНИЛИ

        System.out.println(people.get(1));// получаем первый элемент из списка
        people.set(1, "Robert"); // замена(установка) первого элемента в списке

        // вывод списка и размер списка
        System.out.printf("ArrayList has %d elements \n\n", people.size());
        for(String person : people){
            System.out.println(person);
        }

        System.out.println();

        // проверяем наличие элемента
        if(people.contains("Tom")){ System.out.println("ArrayList contains Tom"); }


        // удаление конкретного элемента
        people.remove("Robert");

        // удаление по индексу
        people.remove(0);

        System.out.println();

        for(String person : people){
            System.out.println(person);
        }
    }
}
