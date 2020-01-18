package JavaCore1;

public class IncrementDecrement {
    
    public static void main(String[] args) {
        
        int x = 25, y;
        
        y = x++;    //post increment (shathe shathe na bere pore jokhon x pabe tokhon barbe)      
        System.out.println("y = "+y);
        
        y = x;      //changed
        System.out.println("y = "+y);
        
        y = ++x;    //pre increment  (x paoar shathe shathe barbe)      
        System.out.println("y = "+y);
        
        y = x;      //unchanged
        System.out.println("y = "+y);
        
        y = x--;    //post decrement  (shathe shathe na kome pore jokhon x pabe tokhon kombe)      
        System.out.println("y = "+y);
        
        y = x;      //changed
        System.out.println("y = "+y);
        
        y = --x;    //pre decrement   (x paoar shathe shathe kombe)     
        System.out.println("y = "+y);
        
        y = x;      //unchanged
        System.out.println("y = "+y);
    }
    
}
