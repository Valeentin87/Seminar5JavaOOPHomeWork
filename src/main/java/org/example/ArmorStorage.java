package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//34.
public class ArmorStorage <T extends Armor> implements Iterable<Armor>{
    Commandor commandor; // отвечает за раздачу доспехов своим воинам
    List<Armor> boxArmor = new ArrayList<>(); // коробка с доспехами

    public ArmorStorage(Commandor commandor) {
        this.commandor = commandor;
    }
//35.
    public void addArmor(T newArmor){
        boxArmor.add(newArmor);
    }
//36.
    @Override
    public Iterator<Armor> iterator() {
        return boxArmor.iterator();
    }
}
