package JavaCore1;

import java.util.Scanner;


public class LogicalOrOperator {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter : ");
        ch = sn.next().charAt(0);   //For  input first character or zero position character
        
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println("Vowel");
        }        
        else{
            System.out.println("Consonant");
        }
        
    }
    
}
