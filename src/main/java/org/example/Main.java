package org.example;
//1. создадим абстактный класс Warrior (воин)
//2. поля в классе определим имя воина (тип String)
    //здоровье (целочисленное значение) helthpoint
// 3. создадим интерфейс "вооруженный" interface Weapon, который будет характеризовать оружие, которым владеет воин
// 4. в интерфейсе определим метод, определяющий величину нанесенного урона (int damage)
//5. В класс Warrior добавим поле weapon еще созданного класса Weapon (оружие), которое будет характеризовать то
    // каким оружием может атаковать воин
//6. Создадим конструктор для класса Warrior
//7. Создадим геттеры и сеттеры на значений полей класса Warrior
//8. Создадим класс-наследник от Warrior (лучник) Archer
//9. Создадим абстрактный класс "лук" (Bow), который будет реализовывать интерфейс оружие (Weapon)
//10. В классе Bow (луки) создадим абстрактный метод range, возвращающий значение дальности полёта стрелы
//11. Создадим класс LongBow, наследник от Bow
//12. В классе LongBow реализуем абстрактные методы:  damage интерфейса Weapon и range абстрактного класса Bow
    // установим величину урона (10) и дальность действия лука (100)
//13. В классе Archer (лучники)  определим как поле класса оружие типа "луки" Bow bow
//14. В конструкторе класса Archer для аргумента weapon жёстко закрепим оружие типа луки Bow
//15. В классе Bow переопределим метод toString, чтобы выводить величину дальности поражения и наносимого урона
//16. В методе LongBow переопределим toString
//17. Переопределим toString для Родительского класса воин
//18. Переопределим toString для класса лучники Archer
//19. Сделаем класс Меченосцев Barbarian наследников Warrior
//20. Создадим абстрактный класс топоров Axe
//21. Создадим класс Sekira - наследник от топоров и реализуем в нём методы абстрактного класса Axe и интерфейса Weapon
//22. Переопределим методы toString для класса Sekiraсоздали предводителя первой команды
                                                                                //вооруженного LongBow

import java.util.ArrayList;
import java.util.List;

//23. Создадим класс командиров, которые будут наследоваться от воинов и носить любое оружие
//24. Создадим класс команда воинов Team, в котором определим обобщение (то, каким типом воинов у нас может быть член команды
    //полем определим командира, который будет набирать воинов, добавим геттер в класс Team
//25. Добавим метод, позволяющий набирать команду
//26. Сделаем класс Team итерируемым по тому типу воина, который определен в обобщении
//27. Создадим три командира и создадим команду лучников, меченосцев и спешанную команду
//28. Создадим интерфейс "защита" Protection, в котором определим метод "уровень защиты" levelProtection
//29. Создадим абстрактный класс "доспехи" Armor, который будет реализовывать интерфейс Protection
//30. Объявим абстрактный метод materialArmor, который будет возвращать тип материала из которого сделана броня
//31. Создадим класс "щит" Shield, наследуемый от класса Armor, переопределим методы абстрактного класса и интерфейса
//32. Создадим класс "кольчуга" СhainMail, наследуемый от класса Armor, переопределим методы абстрактного класса и интерфейса
//33. Создадим класс "шлем" Helmet, наследуемый от класса Armor, переопределим методы абстрактного класса и интерфейса
//34. Создадим класс "склад доспехов" ArmorStorage, в который разрешим все типы оружия и реализуем для него Iterable
    // предоставим право командиру раздавать своим воинам доспехи из коробки
//35. Реализуем метод addArmor, наполняющий коробку с доспехами
//36. Реализуем метод iterator() для нашей коробки с доспехами
//37. Создадим коробку с доспехами boxArmor1 для заранее созданного командира
//38. Создадим класс "вооруженный и защищенный воин", который будет наследоваться от Warrior
public class Main {
    public static void main(String[] args) {
        Commandor commandor1 = new Commandor("superOrk",200,new LongBow()); //создали предводителя первой команды
                                                                                        //вооруженного LongBow
        Team<Archer> archers = new Team<>(commandor1);
        archers.addWarriors(new Archer("archer1",120,new LongBow()));
        archers.addWarriors(new Archer("archer2",130,new LongBow()));
        archers.addWarriors(new Archer("archer3",125,new LongBow()));
        System.out.println("---------------первая команда---------------");
        System.out.println(commandor1);
        archers.forEach(item-> System.out.println(item));

        Commandor commandor2 = new Commandor("superZerg",240,new Sekira());
        Team<Barbarian> barbarians = new Team<>(commandor2);
        barbarians.addWarriors(new Barbarian("barBar1",110,new Sekira()));
        barbarians.addWarriors(new Barbarian("barBar2",120,new Sekira()));
        barbarians.addWarriors(new Barbarian("barBar3",110,new Sekira()));

        System.out.println("---------------вторая команда ---------------");
        System.out.println(commandor2);
        barbarians.forEach(item-> System.out.println(item));
        Commandor commandor3 = new Commandor("universalBoss",300,new Sekira());
        Team<Warrior> gang = new Team<Warrior>(commandor3);
        gang.addWarriors(new Archer("arch6",120,new LongBow()));
        gang.addWarriors(new Barbarian("barBar5",115,new Sekira()));
        System.out.println("---------------третья команда----------------");
        System.out.println(commandor3);
        gang.forEach(item-> System.out.println(item));
        System.out.println("---------первой команде будут разданы доспехи командиром: ------------");
        System.out.println(archers.getCommandor());
        ArmorStorage<Armor> boxArmor1 = new ArmorStorage<>(archers.getCommandor());
        boxArmor1.addArmor(new ChainMail());
        boxArmor1.addArmor(new Helmet());
        boxArmor1.addArmor(new Shield());
        System.out.println("------------будут раздаваться следующие доспехи:-------------");
        boxArmor1.forEach(item-> System.out.println(item));



            }



    }

