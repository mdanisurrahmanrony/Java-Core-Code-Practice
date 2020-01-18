package JavaCore1;

import java.util.Scanner;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many fibonacci numbers : ");
        int n = sc.nextInt();
        
        int first=0, second=1, fibo;
        
        System.out.println("Fibonacci series is : ");
        System.out.print(first+" "+second);
        
        for (int i = 3; i <= n; i++) {
            
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
            
        }
        System.out.println("");
        
    }
    
}
