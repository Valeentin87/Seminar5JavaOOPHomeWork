package org.example;

abstract class Armor implements Protection {
    //29.
    abstract String materialArmor();//возвращает тип материала, из которого сделана защита
    //15.
    @Override
    public String toString() {
        return String.format("Защита выполнена из материала: %s класс защиты: %d ",materialArmor(),levelProtection());
    }
}
