package JavaCore1;

import java.util.Scanner;

public class LoopSum1 {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);   
        
        int sum = 0,m,n;
        
        System.out.println("Enter initial number : ");
        m = sn.nextInt();
        System.out.println("Enter final number : ");
        n = sn.nextInt();
        System.out.println("Even numbers are : ");
        for (int i=m; i<=n; i++){
            
            if(i%2==0){
                
                sum = sum + i;
                System.out.print(i+" ");
                
            }
        }
        
        System.out.println("\nSum = "+sum);
        
    }
    
}
