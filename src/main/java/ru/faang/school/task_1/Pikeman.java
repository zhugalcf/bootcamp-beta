package ru.faang.school.task_1;

public class Pikeman extends Creature{

    public Pikeman() {
        super("Pikeman",10,15,30,10);
    }

    @Override
    public int getDamage() {
        return 15;
    }
}
