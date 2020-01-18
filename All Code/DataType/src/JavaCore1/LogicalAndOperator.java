package JavaCore1;

import java.util.Scanner;


public class LogicalAndOperator {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter : ");
        ch = sn.next().charAt(0);   //For  input first character or zero position character
        
        if(ch>='a' && ch<='z'){ //a-z
            System.out.println("Small Letter");
        }        
        else if(ch>='A' && ch<='Z'){ //A-Z
            System.out.println("Capital Letter");
        }
        else{
            System.out.println("Not a letter");
        }
        
    }
    
}
