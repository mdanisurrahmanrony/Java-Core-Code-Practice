package JavaCore1;

import java.util.Scanner;

public class IfElse2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.println("Enter any integer : ");
        num = sc.nextInt();
        
        if(num > 0){
            System.out.println("Positive");
        }
        else if(num < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal to Zero");
        }
        
    }
    
}
