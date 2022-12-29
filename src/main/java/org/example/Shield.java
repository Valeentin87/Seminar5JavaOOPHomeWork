package org.example;

public class Shield extends Armor{
    @Override
    String materialArmor() {
        return "Kevlar";
    }

    @Override
    public int levelProtection() {
        return 2;
    }

    @Override
    public String toString() {
        return "Рыцарский щит "+super.toString();
    }
}
