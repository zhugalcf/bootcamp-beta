package ru.faang.school.task_1;

public class Swordman extends Creature{

    public Swordman() {
        super("Swordman",15,30,40,5);
    }

    @Override
    public int getDamage() {
        return 30;
    }
}
