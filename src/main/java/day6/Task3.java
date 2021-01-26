package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Швец Максим");
        Teacher teacher = new Teacher("Володин Владимир Владимирович", "физика");
        teacher.evaluate(student.getName());

    }
}
