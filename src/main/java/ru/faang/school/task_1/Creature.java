package ru.faang.school.task_1;

import lombok.Getter;
import lombok.Setter;

public abstract class Creature {
    @Getter @Setter private String name;
    @Getter @Setter private int level;
    @Getter @Setter private int force;
    @Getter @Setter private int defence;
    @Getter @Setter private int speed;
    @Getter @Setter private int quantity;

    public abstract int getDamage();

}
