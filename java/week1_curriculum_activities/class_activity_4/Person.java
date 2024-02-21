package week1_curriculum_activities.class_activity_4;

public abstract class Person {
    private  String name;

    private  int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void display();
}
