package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    int weight;
    int age;
    String color;
    String adress;
    public void initialize(String name)
    {
        this.name = "Petrovich";
    }
    public void initialize(String name, int weight, int age)
    {
        this.name = "Andreich";
        this.weight = 3;
        this.age  = 2;
    }
    public void initialize(String name, int age)
    {
        this.name = "Kotofeich";
        this.age = 3;
    }
    public void initialize(int weight, String color)
    {
        this.weight = 4;
        this.color = "red";
    }
    public void initialize (int weight, String color, String adress)
    {
        this.weight = 4;
        this.color = "Brown";
        this.adress = "pushkina dom kolotushkina";
    }

}
