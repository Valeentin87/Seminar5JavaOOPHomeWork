package org.example;
//33.
public class Helmet extends Armor {
    @Override
    String materialArmor() {
        return "ТИТАН";
    }

    @Override
    public int levelProtection() {
        return 4;
    }

    @Override
    public String toString() {
        return "Шлем " +super.toString();
    }
}
