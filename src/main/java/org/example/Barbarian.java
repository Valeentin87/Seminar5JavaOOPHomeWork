package org.example;
//19.
public class Barbarian extends Warrior {

    public Barbarian(String name, int healthPoint, Axe weapon) {
        super(name, healthPoint, (Weapon) weapon);
    }

    @Override
    public String toString() {
        return "Меченосец "+super.toString();
    }
}
