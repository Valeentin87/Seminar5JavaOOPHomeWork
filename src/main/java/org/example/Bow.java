package org.example;
//9.
abstract class Bow implements Weapon{
//10.
    abstract int range();//возвращает значение дальности полёта стрелы
//15.
    @Override
    public String toString() {
        return String.format("Величина наносимого урона: %d радиус поражения: %d ",damage(),range());
    }
}
