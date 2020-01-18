package JavaCore1;

public class MathClass {
    
    public static void main(String[] args) {
        
        int x = 2;
        int y = 3;
        
        int max = Math.max(x, y);        
        System.out.println("Maximum number among the two number is : "+max);
        
        int min = Math.min(x, y);        
        System.out.println("Minimum number among the two number is : "+min);
        
        int absolute = Math.abs(y);        
        System.out.println("Absolute value of y is : "+absolute);
        
        double power = Math.pow(x, y);
        System.out.println(x+" to the power "+y+" is : "+power);
        
        int round = Math.round(8.8f);
        System.out.println("Round of 8.8 = "+round);
        
        double pi = Math.PI;
        System.out.println("PI = "+pi);
        
    }
    
}
