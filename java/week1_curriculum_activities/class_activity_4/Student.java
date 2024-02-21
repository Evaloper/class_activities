package week1_curriculum_activities.class_activity_4;

public class Student extends Person{
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void display() {
        System.out.println(getName() + " " + getAge());
    }
}
