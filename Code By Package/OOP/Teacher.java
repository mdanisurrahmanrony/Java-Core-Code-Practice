package OOP;


public class Teacher {
    
    String name, gender;
    int phone;
    
    
    void setInformation(String n, String g, int p){
        
        name = n;
        gender = g;
        phone = p;
        
    }
    
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("\n");
        
    };
    
}
