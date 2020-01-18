package JavaCore2;


public class EncapsulationPersonTest1 {
    
    public static void main(String[] args) {
        EncapsulationPerson obj = new EncapsulationPerson();
        
        obj.setName("Rony");       
        System.out.println("Name = "+obj.getName());
        
        obj.setAge(22);       
        System.out.println("Age = "+obj.getAge());
        
    }
    
}
