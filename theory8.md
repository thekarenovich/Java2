
Преобразование типов данных
(без лишнего)

1) Строку в массив 
String people = "Philip J. Fry; Turanga Leela; Bender Bending Rodriguez; Hubert Farnsworth; Hermes Conrad; John D. Zoidberg; Amy Wong"
String[] peopleArray = people.split("; ")

2) Строку в число 
int i = Integer.parseInt("12")

3) Число в строку
String str1 = String.valueOf(97) или String str2 = Integer.toString(12)
