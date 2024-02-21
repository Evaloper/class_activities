package week1_curriculum_activities.class_activity_9;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) throws IOException {
        String deskPath = System.getProperty("user.home") + "/Desktop";

        FileOutputStream frs = new FileOutputStream(deskPath + "/output1.txt");

        ByteArrayOutputStream b = new ByteArrayOutputStream();
        b.write('A');
        b.writeTo(frs);
        b.close();

        System.out.println("Successful......");
    }
}
