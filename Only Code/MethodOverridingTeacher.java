package JavaCore3;


public class MethodOverridingTeacher extends MethodOverridingPerson{
    
    //name, age, displayInformation()
    
    String qualification;
    
    @Override
    void displayInformation(){
        
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Qualification : "+qualification);
        System.out.println("\n\n");
        
    }
    
}
