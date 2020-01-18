package OOP;


public class ConstructorTypes {
    
    public static void main(String[] args) {
        
        ConstructorDemoTeacher teacher1 = new ConstructorDemoTeacher("Md. Anisur Rahman Rony","Male",012313451241);
        teacher1.displayInformation();
        
        ConstructorDemoTeacher teacher2 = new ConstructorDemoTeacher("Alamgir Hossain","Male",011234153453);   
        teacher2.displayInformation();
        
        ConstructorDemoTeacher teacher3 = new ConstructorDemoTeacher();
        teacher3.displayInformation();
        
        ConstructorDemoTeacher teacher4 = new ConstructorDemoTeacher();   
        teacher4.displayInformation();
        
    }
    
}
