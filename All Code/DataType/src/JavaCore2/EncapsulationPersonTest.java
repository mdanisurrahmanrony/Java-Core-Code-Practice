package JavaCore2;


public class EncapsulationPersonTest {
    
    public static void main(String[] args) {
        
//        EncapsulationPerson obj = new EncapsulationPerson();
//        obj.name = "Rony";        
//        obj.age = 22;        
//        obj.display();
        
        EncapsulationPerson obj = new EncapsulationPerson();
        
        obj.setName("Rony");       
        System.out.println("Name = "+obj.getName());
        
        obj.setAge(22);       
        System.out.println("Age = "+obj.getAge());
        
    }
    
}
