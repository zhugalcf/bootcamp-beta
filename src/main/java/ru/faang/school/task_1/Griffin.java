package ru.faang.school.task_1;

public class Griffin extends Creature{

    public Griffin(){
        super("Griffin",20,15,30,10);
    }
    @Override
    public int getDamage() {
        return 15;
    }
}
