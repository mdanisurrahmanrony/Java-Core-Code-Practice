package JavaCore1;

import java.util.Scanner;

public class Series1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);        
        int n, sum=0;
        
        System.out.print("Enter the last number : ");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println(i+" ");
            sum = sum + i;
            
        }
        
        System.out.println("Sum = "+sum);
        
    }
    
}
