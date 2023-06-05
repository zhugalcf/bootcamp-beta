package ru.faang.school.task_1;

public class Angel extends Creature {

    public Angel() {
        super("Angel",14,10,50,30);
    }

    @Override
    public int getDamage() {
        return 10;
    }
}
