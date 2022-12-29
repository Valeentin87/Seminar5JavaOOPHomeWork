package org.example;
//21.
public class Sekira extends Axe implements Weapon {
    @Override
    int numberBlade() {
        return 2;
    }

    @Override
    public int damage() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Секира:  наносит урон %d, количество лезвий %d",damage(),numberBlade());
    }
}
