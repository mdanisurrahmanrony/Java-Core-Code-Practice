package String;

public class WrapperClasss3 {
    
    public static void main(String[] args) {
        
        String s = "32";      
        int i = Integer.parseInt(s);
        System.out.println("i = "+i);
        
        String s1 = "64";      
        double z = Double.parseDouble(s1);
        System.out.println("z = "+z);
        
        String s3 = "312";      
        int x = Integer.valueOf(s3);
        System.out.println("x = "+x);               
       
    }
    
}
