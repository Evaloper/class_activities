package week1_curriculum_activities.class_activity_6;

public class Main {
    public static void main(String[] args) {
        Developers d1 = new Developers(1, "Emmanuel");
        Developers d2 = new Developers(2, "Vivian");
        Developers d3 = new Developers(3, "Sani");
        Developers d4 = new Developers(4, "Rosemary");
        Developers d5 = new Developers(5, "Praise");

        Developers.institute = "Semicolon";

        d1.diplay();
        d2.diplay();
        d3.diplay();
        d4.diplay();
        d5.diplay();
    }
}
