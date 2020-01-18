package JavaCore1;

public class BitWiseOperator {
    
    public static void main(String[] args) {
        
        int a = 32;
        int b = 12;
        
        int c;
        
        c = a & b;  //Bitwise AND
        System.out.println("Bitwise a & b = "+c);
        
        c = a | b;  //Bitwise OR
        System.out.println("Bitwise a | b = "+c);
        
        c = a ^ b;  //Bitwise XOR
        System.out.println("Bitwise a ^ b = "+c);
        
        c = a >> 3;  //Bitwise RIGHT SHIFT that means a ke tinbar dui diye vag kora
        System.out.println("Bitwise a >> b = "+c);
        
        c = a << 3;  //Bitwise LEFT SHIFT that means a ke tinbar dui diye gun kora
        System.out.println("Bitwise a << b = "+c);
        
    }
    
}
