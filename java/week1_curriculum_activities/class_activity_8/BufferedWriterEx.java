package week1_curriculum_activities.class_activity_8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {
    public static void main(String[] args) throws IOException {
        String deskPath = System.getProperty("user.home") + "/Desktop";
        FileWriter wr = new FileWriter(deskPath + "buffer.csv");

        BufferedWriter br = new BufferedWriter(wr);
        br.write("I am still learning how to write into a csv file using buffer");
        br.close();
        System.out.println("Write successfully");
    }
}
