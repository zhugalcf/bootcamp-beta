package ru.faang.school.task_1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    @Getter @Setter private String name;
    @Getter @Setter private String fraction;
    @Getter @Setter private int experience;
    @Getter @Setter private int level;
    @Getter private List<Creature> army = new ArrayList<>();

    public Hero(String name, String fraction, int experience, int level) {
        this.name = name;
        this.fraction = fraction;
        this.experience = experience;
        this.level = level;
    }

    public void addCreature(Creature creature, int quantity) {
        for (int i = 0; i < quantity; i++) {
            army.add(creature);
        }
    }

    public void removeCreature(Class<? extends Creature> creature, int quantity) {
        for (int i = 0; i < quantity; i++) {
            for (Creature unit : army) {
                if (unit.getClass() == creature) {
                    army.remove(unit);
                    break;
                }
            }
        }
    }

    public int getArmyPower(){
        int power = 0;
        for (Creature creature: army){
            power += creature.getForce();
        }
        return power;
    }

    public int getArmyDefence(){
        int defence = 0;
        for (Creature creature: army){
            defence += creature.getDefence();
        }
        return defence;
    }

    public int getArmySpeed(){
        int speed = 0;
        for (Creature creature: army){
            speed += creature.getSpeed();
        }
        return speed;
    }

    @Override
    public String toString() {
        return name;
    }
}
