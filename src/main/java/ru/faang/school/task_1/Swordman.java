package ru.faang.school.task_1;

public class Swordman extends Creature{

    public Swordman() {
        setName("Swordman");
        setForce(30);
        setDefence(50);
        setLevel(8);
        setSpeed(5);
        setQuantity(15);
    }

    @Override
    public int getDamage() {
        return 0;
    }
}
