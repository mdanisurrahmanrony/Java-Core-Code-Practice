package JavaCore4.File;

import java.io.File;

public class FileDemo4 {

    public static void main(String[] args) {

        File dir = new File("G:\\Person");
        dir.mkdir();      //directory will be created at location "G:\\"
        String path = dir.getAbsolutePath();       //for getting directory/folder path

        File file1 = new File(path + "/student.txt");
        File file2 = new File(path + "/teacher.txt");

        try {

            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files have been created in the given path of directory/folder");

        } catch (Exception e) {

            System.out.println(e);

        }

        if (file1.exists()) {

            System.out.println("File1 exists");

        }

        if (file2.exists()) {

            System.out.println("File2 exists");

        } else {

            System.out.println("File2 does not exist");

        }

//        file2.delete();
//        
//        if(file2.exists()){
//            
//            System.out.println("File2 exists");
//            
//        }else{
//            
//             System.out.println("File2 does not exist");
//            
//        }
    }

}
