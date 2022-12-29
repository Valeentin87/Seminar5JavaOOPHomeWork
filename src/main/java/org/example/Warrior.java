package org.example;
//1.
abstract class Warrior { // абстрактный класс Warrior (воины)
    private String name; // имя воина
//2.
    private int healthPoint; //количество жизней
//5.
    private Weapon weapon; // характеризует поле типа Weapon, указывающее на тип оружия, которым атакует воин

//6.

    public Warrior(String name, int healthPoint, Weapon weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }
//7.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

//17.

    @Override
    public String toString() {
        return String.format("Имя: %s Здоровье: %d Оружие: %s",name,healthPoint,weapon.toString());
    }
}
