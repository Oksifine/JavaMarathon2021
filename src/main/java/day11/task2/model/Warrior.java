package day11.task2.model;

public class Warrior extends Hero {
    public Warrior(){
        physDef = 0.8;
        physAttack = 30;

    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
