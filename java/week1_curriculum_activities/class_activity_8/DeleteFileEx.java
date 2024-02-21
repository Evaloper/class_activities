package week1_curriculum_activities.class_activity_8;

import java.io.File;

public class DeleteFileEx {
    public static void main(String[] args) {
        String deskPath = System.getProperty("user.home") + "/Desktop";

        File file = new File(deskPath + "fileOutput.csv");

        if(file.delete()){
            System.out.println("file deleted successfully");
        } else {
            System.out.println("File does not exist");
        }
    }
}
