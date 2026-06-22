package JavaIO;

import java.io.*;
import java.util.*;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("feedback.txt");

        System.out.println("Enter 5 feedback messages:");

        for (int i = 1; i <= 5; i++) {
            fw.write(sc.nextLine() + "\n");
        }

        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("feedback.txt"));

        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            if (line.toLowerCase().contains("good")) {
                count++;
            }
        }

        br.close();

        System.out.println("Good Feedback Count = " + count);
    }
}