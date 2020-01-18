package JavaCore4.File;

import java.io.File;
import java.util.Scanner;

public class readFile {

    public static void main(String[] args) {
        

        try {
            
            File file = new File("G:/File Read Example/File Read/Person.txt");
            Scanner sc = new Scanner(file);
            
            while(sc.hasNext()){
                
                String id = sc.next();
                String name = sc.next();
                
                System.out.println("ID : "+id+", Name : "+name);
                
            }
            
            sc.close();

        } catch(Exception e){
            
            System.out.println(e);

        }

    }

}
