package String;


public class WrapperClasss1 {
    
    public static void main(String[] args) {
        
        //unboxing (object -> primitive data type)
        
        Double d = new Double(10.25);
        System.out.println("d = "+d);
        
        double e = d.doubleValue();    //othoba shudhu (double e = d) likhlei hobe
        
        System.out.println("e = "+e);
        
    }
    
}
