package week1_curriculum_activities.class_activity_6.class_exercise_6;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Emma");
        Student s2 = new Student(2, "David");

        Student.changeUniversity();

        s1.display();
        s2.display();
    }
}
