package JavaCore4.TypeCasting;


public class Test2 {
    
    public static void main(String[] args) {
        
        Person p = new Teacher();       //upcasting
        p.display();
        
        Teacher t = (Teacher) new Person();     //downcasting
        t.display();
        
    }
    
}
