package JavaCore1;

import java.util.Scanner;

public class OperatorOperandExpression {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1,num2,result;
        
//        num1 = 20;
//        num2 = 10;

        System.out.println("Enter first number:");
        
        num1 = input.nextInt();
        
        System.out.println("Enter second number:");
        
        num2 = input.nextInt();
        
        result = num1+num2;
        System.out.println("Summation = "+result);
        
        result = num1-num2;
        System.out.println("Subtraction = "+result);
        
        result = num1*num2;
        System.out.println("Multiplication = "+result);
        
        double result2 = (double) num1/num2;   //Example of type casting
        System.out.println("Division = "+result2);
        
        result = num1%num2;
        System.out.println("Remainder = "+result);
        
    }
}
