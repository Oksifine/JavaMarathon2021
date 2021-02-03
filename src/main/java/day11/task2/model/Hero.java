package day11.task2.model;

import day11.task2.interfaces.PhysAttack;

public abstract class Hero implements PhysAttack {
    final int MIN_HEALTH = 0;
    final int MAX_HEALTH = 100;
    int health;
    int physAttack;
    double physDef;
    double magicDef;

    public Hero() {
        this.health = 100;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double attackScore = physAttack * (1 - hero.physDef);
        if (hero.health - attackScore < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attackScore;
        }
    }
}
