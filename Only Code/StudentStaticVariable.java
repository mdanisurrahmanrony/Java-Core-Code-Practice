package StaticKeyword;

public class StudentStaticVariable {
    
    String name;
    int id;
    static String universityName = "LU";
    
    StudentStaticVariable(String n, int i){
        
        name = n;
        id = i;
        
    }
    
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("University Name : "+universityName);
        System.out.println("\n");
        
    }
    
}
