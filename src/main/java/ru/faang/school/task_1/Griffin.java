package ru.faang.school.task_1;

public class Griffin extends Creature{

    public Griffin(){
        setName("Griffin");
        setForce(15);
        setDefence(70);
        setLevel(13);
        setSpeed(30);
        setQuantity(5);
    }
    @Override
    public int getDamage() {
        return 0;
    }
}
