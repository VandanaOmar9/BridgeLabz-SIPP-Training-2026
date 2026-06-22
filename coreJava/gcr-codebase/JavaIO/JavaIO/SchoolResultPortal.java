package JavaIO;

import java.io.*;
import java.util.*;
public class SchoolResultPortal {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("students.txt"));

            String line;
            double total = 0;
            int count = 0;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                String name = data[0];
                int marks = Integer.parseInt(data[1]);

                total += marks;
                count++;

                FileWriter fw = new FileWriter("report.txt", true);
                fw.write("Name : " + name + " Marks : " + marks + "\n");
                fw.close();
            }

            double average = total / count;

            FileWriter fw = new FileWriter("report.txt", true);
            fw.write("Average Marks = " + average + "\n");
            fw.close();

            br.close();

            System.out.println("Report Generated Successfully");

        } catch (FileNotFoundException e) {
            System.out.println("Student file not found.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}