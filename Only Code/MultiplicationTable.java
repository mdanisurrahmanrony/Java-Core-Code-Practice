package JavaCore1;

import java.util.Scanner;

public class MultiplicationTable {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        int num;

        System.out.print("Enter any number : ");
        num = sn.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(num+" X "+i+" = "+num*i);
            
        }
        
    }
    
}
