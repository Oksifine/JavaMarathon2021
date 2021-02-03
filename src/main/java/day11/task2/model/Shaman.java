package day11.task2.model;

import day11.task2.interfaces.Healer;
import day11.task2.interfaces.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {
    int magicAttack = 15;
    static final int HEAL_AMOUNT = 50;
    static final int HEAL_TEAMMATE_AMOUNT = 30;

    public Shaman() {
        physAttack = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }


    @Override
    public void healHimself() {

        if (health + HEAL_AMOUNT > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_AMOUNT;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_TEAMMATE_AMOUNT > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_TEAMMATE_AMOUNT;
        }
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

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}