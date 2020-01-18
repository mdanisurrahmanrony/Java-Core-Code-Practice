package StaticKeyword;

public class StudentStaticVariable2 {    
    
//    int count = 0;      //Non static variable
      static int count = 0;      //Static variable
    
    StudentStaticVariable2(){
        
        count++;
        
    }
    
    void totalStudent(){
        
        System.out.println("Total Student = "+count);
        
    }
    
}
