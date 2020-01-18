package String;

public class StringBuilderr {
    
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("Anisur");
        
        System.out.println("str = "+str);
        
        str.append(" Rahman ");
        str.append(23);
        str.append(12.5);
        
        System.out.println("str = "+str);
        
//        str.reverse();
//        System.out.println("str = "+str);
        
        str.delete(2, 5);
        System.out.println("str = "+str);
        
    }
    
}
