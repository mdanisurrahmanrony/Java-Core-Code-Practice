package ReturningValueFromMethod;

public class Test {
    
    public static void main(String[] args) {
        
        ReturningValue obj1 = new ReturningValue();
        int result = obj1.square(5);
        System.out.println("Square of 5 = "+result);
        
        ReturningValue obj2 = new ReturningValue();
        System.out.println("Square of 6 = "+obj2.square(6));
        
        ReturningValue obj3 = new ReturningValue();
        System.out.println("Square of 7 = "+obj3.square(7));
                
    }
    
}
