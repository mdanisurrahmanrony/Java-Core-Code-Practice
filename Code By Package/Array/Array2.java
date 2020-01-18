package Array;

import java.util.Scanner;

public class Array2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double[] number = new double[5];
        double sum = 0;
        
        System.out.print("Please enter 5 numbers : ");
        
        number[0] = sc.nextDouble();
        number[1] = sc.nextDouble();
        number[2] = sc.nextDouble();
        number[3] = sc.nextDouble();
        number[4] = sc.nextDouble();
        
        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("The sum is : "+sum);
        
    }
}
