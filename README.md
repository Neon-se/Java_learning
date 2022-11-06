# Java_learning
### Made for me, beautiful Java code and awful teacher :<
## Введение
*Java* - строго типизированный объектно-ориентированный язык
программирования общего назначения.

*Функциональное программирование* - создание программ, в котором процесс
вычисления трактуется как вычисление функций.

## Объектно-ориентированное программирование
*ООП (Объектно-ориентированное программирование)* - методология
программирования, которая основана на представлении программы
в виде совокупности объектов. Каждый из объектов является экземпляром
определённого класса. Классы образуют иерархию наследования.

>Основные понятия: *наследование*, *инкапсуляция*, *полиморфизм*

*Объект* - сущность в программировании, обладающая состоянием, поведением,
имеющая свойства и методы.

```java
Human {
    age: 12,
    name: 'Ван',
    height: 146,
    weight: 38
}
```

*Класс* - модель для создания объектов определённого типа, описывающая их
структуру и определяющая алгоритм для работы с ними.

```java
public class Human {
    int modelAge;
    String modelName;
    int modelHeight;
    int modelWeight;
    
    public Human(int age, String name, int height, int weight) {
        modelAge = age;
        modelNamee = name;
        modelHeight = height;
        modelWeight = weight;
    }
}

let human1 = new Human(12, 'Ван', 146, 38);
let human2 = new Human(98, 'Дедушка Ван', 161, 45);
```