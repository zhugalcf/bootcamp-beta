package ru.faang.school.task_1;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hero {
    @Getter @Setter private String name;
    @Getter @Setter private String fraction;
    @Getter @Setter private int experience;
    @Getter @Setter private int level;
    private List<Creature> army = new ArrayList<>();

    private final static  String[] creatureClasses = {"Angel","Griffin","Swordman","Pikeman"};

    public Hero(String name, String fraction, int experience, int level) {
        this.name = name;
        this.fraction = fraction;
        this.experience = experience;
        this.level = level;
    }

    public void addCreature(String className, int quantity){
        for (int i = 0; i < quantity ; i++) {
            switch (className){
                case "Angel":
                    army.add(new Angel());
            }
        }
    }

    public void removeCreature(Class<? extends Creature> creature, int quantity) {
        for (int i = 0; i < quantity; i++) {
            for (Creature unit : army) {
                if (unit.getClass() == creature) {
                    army.remove(unit);
                }
            }
        }
    }
    public void getArmy(){
        for (Creature creature: army){
            System.out.println(creature.toString());
        }
    }
}
