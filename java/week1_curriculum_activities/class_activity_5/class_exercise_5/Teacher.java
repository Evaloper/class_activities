package week1_curriculum_activities.class_activity_5.class_exercise_5;

public class Teacher implements Teachable{

    @Override
    public void teachCourse(String course) {
        System.out.println("Teaching " + course);
    }
}
