package ru.faang.school.task_1;

import lombok.Getter;
import lombok.ToString;

@ToString
public abstract class Creature {
    @Getter private String name;
    @Getter private int level;
    @Getter private int force;
    @Getter private int defence;
    @Getter private int speed;

    public Creature(String name, int level, int force, int defence, int speed) {
        this.name = name;
        this.level = level;
        this.force = force;
        this.defence = defence;
        this.speed = speed;
    }

    public abstract int getDamage();

}
