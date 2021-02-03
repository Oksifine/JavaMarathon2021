package day11.task2.model;

import day11.task2.interfaces.MagicAttack;

public class Magician extends Hero implements MagicAttack {

    private int magicAttack = 20;

    public Magician() {
        physAttack = 5;
        physDef = 0;
        magicDef = 0.8;

    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
    public void magicalAttack(Hero hero) {
        double attackScore = magicAttack * (1 - hero.magicDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }
}
