import java.util.Arrays; // для методов массива

class Main {
    public static void main(String[] args) {
        
        int array[] = {1, 5, 4, 3, 7}; 
        
        // System.out.println(array); // - неправильный вывод массива 
        
        System.out.println(Arrays.toString(array)); // печатаем массив "правильно" методом toString
        
        Arrays.sort(array, 0, 4); //сортируем весь массив от нулевого до четвёртого члена
        // в данном случае, весь массив отсортировался
        
        System.out.println(Arrays.toString(array));//выводим отсортированный массив на экран
        
        System.out.println(Arrays.binarySearch(array, 5));
        // ищем key - число 5 в отсортированном массиве.
        //метод binarySearch выдаст индекс элемента остортированного массива, в котором "спрятано" искомое число
        
        System.out.println(Arrays.binarySearch(array, 0));
        //а теперь попробуем найти число, которого в массиве нет

    }
}
