package JavaCore4.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class writeIntoFile1 {

    public static void main(String[] args) {

        String id, name;

        try {

            Formatter formatter = new Formatter("G:/File Create Example/File Write/Person.txt");

            Scanner sc = new Scanner(System.in);

            System.out.println("How many students : ");
            int num = sc.nextInt();

            for (int i = 1; i <= num; i++) {

                System.out.print("Enter student id and name : ");
                id = sc.next();
                name = sc.next();
                formatter.format("%s %s\r\n", id, name);

            }

            formatter.close();     //closing formatter

        } catch (FileNotFoundException e) {

            System.out.println(e);

        }

    }

}
