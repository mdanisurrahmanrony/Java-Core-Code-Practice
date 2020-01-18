package OOP;


public class ConstructorDemoTeacher {
    
    String name, gender;
    int phone;
    
    
    ConstructorDemoTeacher(String n, String g, int p){      //Parametrized Constructor
        
        name = n;
        gender = g;
        phone = p;
        
    }
    
    ConstructorDemoTeacher(){      //Default Constructor
        
        System.out.println("No Value");
        
    }
    
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("\n");
        
    };
    
}
