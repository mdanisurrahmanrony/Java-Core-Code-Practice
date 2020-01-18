package JavaCore1;

import java.util.Scanner;

public class ReverseInteger {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        int sum=0, r,temp, num;
        
        System.out.print("Enter any number : ");
        num = sn.nextInt();
        
        temp = num;
        
        while(temp!=0){
            
            r = temp%10;
            sum = sum*10 + r;
            temp = temp/10;
            
        }
        
        System.out.println("Reverse of the number : "+sum);
    }
    
}
