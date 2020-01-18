package JavaCore1;

import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number;        
        String name;
        double num1;
        
        System.out.print("Enter any number : ");
        number = input.nextInt();
        
        System.out.print("Enter your name : ");
        name = input.nextLine();
        
        System.out.print("Enter any double value : ");
        num1 = input.nextDouble();
        
        System.out.println("Number = "+number);
        System.out.println("Your Name is : "+name);
        System.out.println("Double value is : "+num1);
    }
}
