package ru.faang.school.task_1;

public class Angel extends Creature {

    public Angel() {
        setName("Angel");
        setForce(10);
        setDefence(50);
        setLevel(5);
        setSpeed(20);
    }

    @Override
    public int getDamage() {
        return 10;
    }
}
