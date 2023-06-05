package ru.faang.school.task_1;

public class Game {
    public static void main(String[] args) {
        Battlefield battlefield = new Battlefield();

        battlefield.getHero1().addCreature(new Angel(),10);
        battlefield.getHero1().addCreature(new Griffin(),20);

        battlefield.getHero2().addCreature(new Pikeman(),30);
        battlefield.getHero2().addCreature(new Swordman(),25);
        battlefield.getHero2().removeCreature(Swordman.class,5);

        System.out.println("Winner is: " + battlefield.battle().toString());
    }
}
