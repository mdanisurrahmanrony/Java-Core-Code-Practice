package JavaCore4.File;

import java.io.File;


public class FileDemo2 {
    
    
    public static void main(String[] args) {
        
        File dir = new File("G:\\Person");
        dir.mkdir();      //directory will be created
        
        String dirlocation = dir.getAbsolutePath();     //get the directory path that was created
        System.out.println("Directory Path : "+dirlocation);
        
        System.out.println("Directory Name : "+dir.getName());     //get the directory name
        
        if (dir.delete()) {
            
            System.out.println(dir.getName()+" directory/folder has been deleted.");
            
        }
        
    }
    
}
