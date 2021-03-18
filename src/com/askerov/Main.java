package com.askerov;

public class Main {

    public static void main(String[] args) {
	// write your code here

//● Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.

//Написать 2 разных конструктора для создания объекта.

// В одном конструкторе задаются все поля, в другом только здоровье и урон.

// Добавить в класс Hero геттеры для всех полей.////

//● Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.

// Добавить в класс геттеры и сеттеры для всех полей.

//● В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).

// Затем распечатать всю информацию о боссе.


//ДЗ на сообразительность:

//● Добавить метод в классе Main который называется createHeroes, в теле метода необходимо
// создать 3х героев с помощью класса Hero, используя при этом разные варианты конструкторов
// (либо первый либо второй). Затем поместить созданные экземпляры героев в массив и вернуть
// его с помощью команды return, как возвращаемый результат метода createHeroes.
//● Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива
// через цикл. Дедлайн 06.03.2021

    Boss boss = new Boss();
    boss.setHealth(500);
    boss.setDamage(100);
    boss.getSuperDefense();
    boss.printInfo();

    Hero[]array = new Hero[3];
    array = createHeroes();
        for (int i = 0; i < array.length; i++) {

            System.out.println("Damage: " + array[i].getDamage()+ "Health: " + array[i].getHealth()+
                    "Super power: " + array[i].getSuperPower());

        }

    }

    public static Hero[] createHeroes(){

        Hero hero = new Hero(300, 50,"Fast");
        Hero hero1 = new Hero(350, 60," ");
        Hero hero2 = new Hero(250, 40, "Stromg");

        Hero[] heroes = new Hero[3];
        heroes[0] = hero;
        heroes [1] = hero1;
        heroes [2] = hero2;
        return heroes;
    }
}
