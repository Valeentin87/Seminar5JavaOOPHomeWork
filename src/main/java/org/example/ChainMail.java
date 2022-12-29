package org.example;
//32.
public class ChainMail extends Armor { //класс кольчуги
    @Override
    String materialArmor() {
        return "сталь";
    }

    @Override
    public int levelProtection() {
        return 3;
    }

    @Override
    public String toString() {
        return "кольчуга "+super.toString();
    }
}
