package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//24.
public class Team <T extends Warrior> implements Iterable<T>{ //26. Делаем класс итерируемым
    Commandor commandor;
    List<T> team = new ArrayList<>();

    public Team(Commandor commandor) {
        this.commandor = commandor;
    }

    public Commandor getCommandor() {
        return commandor;
    }
//25.
    public void addWarriors(T newWarrior){
        team.add(newWarrior);

    }

    @Override
    public Iterator<T> iterator() {
        return team.iterator(); // возвращает итератор из нашей команды воинов
        }
    }

