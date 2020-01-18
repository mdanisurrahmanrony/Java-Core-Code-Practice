package JavaCore1;

import java.util.Scanner;

public class VowelConsonantDemo {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        char ch;
        System.out.println("Enter any letter : ");
        ch = sn.next().charAt(0);   //For  input first character or zero position character
        
        if(ch == 'a'){
            System.out.println("Vowel");
        }
        else if(ch == 'e'){
            System.out.println("Vowel");
        }
        else if(ch == 'i'){
            System.out.println("Vowel");
        }
        else if(ch == 'o'){
            System.out.println("Vowel");
        }
        else if(ch == 'u'){
            System.out.println("Vowel");
        }
        else if(ch == 'A'){
            System.out.println("Vowel");
        }
        else if(ch == 'E'){
            System.out.println("Vowel");
        }
        else if(ch == 'I'){
            System.out.println("Vowel");
        }
        else if(ch == 'O'){
            System.out.println("Vowel");
        }
        else if(ch == 'U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
    
}
