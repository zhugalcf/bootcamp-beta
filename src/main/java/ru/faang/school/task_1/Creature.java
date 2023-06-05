package ru.faang.school.task_1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public abstract class Creature {
    @Getter @Setter private String name;
    @Getter @Setter private int level;
    @Getter @Setter private int force;
    @Getter @Setter private int defence;
    @Getter @Setter private int speed;
    @Getter @Setter private int quantity;

    public Creature(String name, int level, int force, int defence, int speed) {
        this.name = name;
        this.level = level;
        this.force = force;
        this.defence = defence;
        this.speed = speed;
        quantity++;
    }

    public abstract int getDamage();

}
