package week1_curriculum_activities.class_activity_6;

public class Developers {
    int id;
    String name;
    static String institute;

    public Developers(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void diplay(){
        System.out.println(id + " " + name + " " + institute);
    }
}
