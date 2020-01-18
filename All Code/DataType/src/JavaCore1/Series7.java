package JavaCore1;

import java.util.Scanner;

public class Series7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        int n, mul=1;
        
        System.out.print("Enter the last number : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i+=2) {
            
            System.out.print(i+" ");
            mul = mul*i;
            
        }
        
        System.out.println("\nMultiplication Result = "+mul);
        
    }
    
}
