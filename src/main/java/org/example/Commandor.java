package org.example;

public class Commandor extends Warrior{
    public Commandor(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }

    @Override
    public String toString() {
        return "Командир: " + super.toString();
    }

}
