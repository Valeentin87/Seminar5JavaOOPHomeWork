package org.example;
//8.
public class Archer extends Warrior {
//13.
    Bow bow;


    public Archer(String name, int healthPoint, Bow bow) { //14. Задали тип оружия в конструкторе Bow
        super(name, healthPoint, bow);
    }

    @Override
    public String toString() {
        return "Лучник "+super.toString();
    }
}
