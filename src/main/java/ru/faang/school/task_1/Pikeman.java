package ru.faang.school.task_1;

public class Pikeman extends Creature{

    public Pikeman() {
        setName("Pikeman");
        setForce(15);
        setDefence(30);
        setLevel(2);
        setSpeed(10);
        setQuantity(40);
    }

    @Override
    public int getDamage() {
        return 0;
    }
}
