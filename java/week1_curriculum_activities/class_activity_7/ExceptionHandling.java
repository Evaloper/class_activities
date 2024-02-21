package week1_curriculum_activities.class_activity_7;

public class ExceptionHandling {

    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 0;
        int num3;


        try{
             num3 = num1 /num2;
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println(num1 / (num2 + 2));
    }
    }


