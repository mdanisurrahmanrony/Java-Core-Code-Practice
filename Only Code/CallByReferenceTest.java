package JavaCore2;


public class CallByReferenceTest {
    
    public static void main(String[] args) {
        
        CallByReference obj1 = new CallByReference();
        obj1.name = "Rony";
        System.out.println("Before calling : "+obj1.name);
        
        obj1.change(obj1);
        System.out.println("After calling : "+obj1.name);
        
    }
    
}
