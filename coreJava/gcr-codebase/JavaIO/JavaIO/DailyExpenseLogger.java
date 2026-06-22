package JavaIO;

import java.io.*;
import java.util.*;

public class DailyExpenseLogger {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("expenses.txt", true);

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Amount: ");
        int amount = sc.nextInt();

        fw.write(category + " - " + amount + "\n");

        fw.close();

        System.out.println("Expense Added Successfully");
    }
}