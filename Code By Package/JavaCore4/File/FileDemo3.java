package JavaCore4.File;

import java.io.File;


public class FileDemo3 {
    
    
    public static void main(String[] args) {
        
        File dir = new File("G:\\Person");
        dir.mkdir();      //directory will be created at location "G:\\"
        String pathe = dir.getAbsolutePath();
        
        File file1 = new File("G:\\File Create Example/student.txt");
        File file2 = new File("G:\\File Create Example/teacher.txt");
        
        try{
            
            file1.createNewFile();      //file will be created at location "G:\\File Create Example/"
            file2.createNewFile();      //file will be created at location "G:\\File Create Example/"
            System.out.println("Files are created");
            
        }catch(Exception e){
            
            
        }
        
    }
    
}
