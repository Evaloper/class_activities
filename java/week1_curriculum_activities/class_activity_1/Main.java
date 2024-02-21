package week1_curriculum_activities.class_activity_1;

public class Main {
    public static void main(String[] args) {
        InternshipForm obj1 = new InternshipForm("Dera Classic", 25, "female");
        InternshipForm obj2 = new InternshipForm("Emma Abu", 27, "male");

        System.out.println("Name: " + obj1.name);
        System.out.println("Age: " + obj1.age);
        System.out.println("Gender: " + obj1.gender);
        System.out.println("Name: " + obj2.name);
        System.out.println("Age: " + obj2.age);
        System.out.println("Gender: " + obj2.gender);
    }


}
