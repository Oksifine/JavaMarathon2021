package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;


    public Teacher(String teacherName, String subject) {
        this.name = teacherName;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void evaluate(String studentname) {
        Random random = new Random();
        int mark = random.nextInt(3) + 2;
        String studentmark;
        switch (mark) {
            case 2:
                studentmark = "неудовлетворительно";
                break;
            case 3:
                studentmark = "удовлетворительно";
                break;
            case 4:
                studentmark = "хорошо";
                break;
            case 5:
                studentmark = "отлично";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + mark);
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + studentname + " по предмету " + subject + " на оценку " + studentmark + ".");


    }

}
