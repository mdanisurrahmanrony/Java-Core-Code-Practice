package JavaCore1;

import java.util.Scanner;


public class DigitSpellingUsingSwitch {
    
    public static void main(String[] args) {
        
        Scanner in =  new Scanner(System.in);
        int digit;
        System.out.println("Enter any digit : ");
        digit = in.nextInt();
        
        switch(digit){
            
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break; 
            default:
                System.out.println("Not a digit");
            
        }
    }
    
}
