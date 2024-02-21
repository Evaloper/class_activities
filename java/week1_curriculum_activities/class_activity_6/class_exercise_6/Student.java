package week1_curriculum_activities.class_activity_6.class_exercise_6;

public class Student {

    int matricNo;
    String name;

    static String universityName = "Uniben";

    public Student(int matricNo, String name) {
        this.matricNo = matricNo;
        this.name = name;
    }

    static void changeUniversity(){
        universityName = "Covenant";
    }

    void display(){
        System.out.println(matricNo + " " + name + " " + universityName );
    }

}
