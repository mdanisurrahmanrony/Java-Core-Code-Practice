package JavaCore2;

public class AutomaticTypeConversionTest {
    
    public static void main(String[] args) {
        
        AutomaticTypeConversion obj = new AutomaticTypeConversion();
        
        obj.add();
        obj.add(5,10);      //automatic type conversion er example. integer type method nai tai she double type method e jabe.
        obj.add(5.f,10);
        obj.add(6.5,5.5);
        obj.add(5,10,20);
        
    }
    
}
