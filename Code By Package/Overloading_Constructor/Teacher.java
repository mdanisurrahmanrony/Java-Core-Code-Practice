package Overloading_Constructor;

public class Teacher {
    
    String name,gender;
    int phone;
    
    Teacher(){
        
        System.out.println("No Information");
        System.out.println("\n");
        
    }
    
    Teacher(String n, String g){
        
        name = n;
        gender = g;
        
    }
    
    Teacher(String n, String g, int p){
        
        name = n;
        gender = g;
        phone = p;
    }
    
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("\n");
        
    }
    
}
