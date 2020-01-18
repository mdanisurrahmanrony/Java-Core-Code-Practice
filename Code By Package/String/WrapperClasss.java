package String;


public class WrapperClasss {
    
    public static void main(String[] args) {
        
        //autoboxing (primitive -> object)
        
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = "+y);
        
        Integer z = x;      //Integer.vaueOf(x) automatic dhore nebe. autoboxing.
        System.out.println("z = "+z);
        
    }
    
}
