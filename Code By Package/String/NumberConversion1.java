package String;

public class NumberConversion1 {
    
    public static void main(String[] args) {
        
        int decimal = 15;
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary of "+decimal+" is : "+binary);        
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal of "+decimal+" is : "+octal);        
        String hexa = Integer.toHexString(decimal);
        System.out.println("Hexadecimal of "+decimal+" is : "+hexa);   
        
    }
    
}
