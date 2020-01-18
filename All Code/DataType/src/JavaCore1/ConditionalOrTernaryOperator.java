package JavaCore1;

import java.util.Scanner;

public class ConditionalOrTernaryOperator {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        int num1,num2,large;
        System.out.println("Enter 2 numbers : ");
        num1 = sn.nextInt();
        num2 = sn.nextInt();
        
        large = (num1>num2) ? num1 : num2;
        
        System.out.println("Largest number among the two is : "+large);
    }
    
}
