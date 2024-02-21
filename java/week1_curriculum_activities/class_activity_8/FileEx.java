package week1_curriculum_activities.class_activity_8;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        String deskPath = System.getProperty("user.home") + "/Desktop";

        try{
            File file = new File(deskPath + "fileOutput.csv");

            if(file.createNewFile()){
                System.out.println("New file has been created");
            } else {
                System.out.println("File already exists");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
