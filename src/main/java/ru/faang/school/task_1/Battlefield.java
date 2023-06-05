package ru.faang.school.task_1;

import lombok.Getter;

public class Battlefield {

    @Getter private Hero hero1 = new Hero("Sergey", "Fenix",10,20);
    @Getter private Hero hero2 = new Hero("Bot","Goblin",12,15);


    public Hero battle(){
        System.out.println("Battle start...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double speedCoefficient = (double)hero1.getArmySpeed() / hero2.getArmySpeed();  /* коэффициент скорости,
        снижает или увеличивает силу первого героя в зависимости от различия в скорости атаки 2х героев,
        у второго героя он берется за единицу */
        double hero1Coefficient = ((hero1.getArmyPower() * speedCoefficient) / hero2.getArmyDefence());
        double hero2Coefficient = (double) hero2.getArmyPower() / hero1.getArmyDefence();
        return hero1Coefficient >= hero2Coefficient ? hero1 : hero2;
    }
}
