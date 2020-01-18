package JavaCore2;


public class CallByValueTest {
    
    public static void main(String[] args) {
        
        CallByValue obj1 = new CallByValue();
        int x = 10; //Primitive data
        System.out.println("x before calling : "+x);
        
        obj1.change(x);
        System.out.println("x after calling : "+x);
        
    }
    
}
