package org.example;
//11.
public class LongBow extends Bow{


    @Override
    int range() {
        return 100;
    }

    @Override
    public int damage() {
        return 10;
    }

//16.

    @Override
    public String toString() {
        return "Большой лук:"+super.toString();
    }
}
