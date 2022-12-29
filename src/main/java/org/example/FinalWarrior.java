package org.example;

public class FinalWarrior extends Warrior {
    Armor armor;

    public FinalWarrior(String name, int healthPoint, Weapon weapon, Armor armor) {
        super(name, healthPoint, weapon);
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Воин "+super.toString()+ "получил оружие " + armor.toString();
    }
}
