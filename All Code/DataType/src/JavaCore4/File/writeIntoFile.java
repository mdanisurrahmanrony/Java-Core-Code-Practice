package JavaCore4.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class writeIntoFile {

    public static void main(String[] args) {

        try {
            
            Formatter formatter = new Formatter("G:/File Create Example/File Write/Person.txt");
            
            formatter.format("%s %s\r\n","101","Rony");     //write using formatter
            formatter.format("%s %s\r\n","102","Sanjida");     //write using formatter
            formatter.format("%s %s\r\n","103","Jui");     //write using formatter
            
            formatter.close();     //closing formatter
            
        }catch(FileNotFoundException e){
            
            System.out.println(e);
            
        }

    }

}
