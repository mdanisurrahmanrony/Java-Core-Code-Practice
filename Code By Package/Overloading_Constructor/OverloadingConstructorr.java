package Overloading_Constructor;

public class OverloadingConstructorr {
    
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Rony","Male");
        teacher2.displayInformation();
        Teacher teacher3 = new Teacher("Lisa","Female",017104447000);
        teacher3.displayInformation();
        
    }
    
}
