package Array;

import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;

        System.out.print("Please enter 5 numbers : ");

        for (int i = 0; i < number.length; i++) {

            number[i] = sc.nextDouble();

        }

        for (int i = 0; i < number.length; i++) {

            sum = sum + number[i];

        }

        double avg = sum / number.length;
        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + avg);
        
        double  max = number[0];
        double  min = number[0];
        
        for (int i = 1; i < 4; i++) {
            
            if(number[i]>max){
                max = number[i];
            }            
        }
        
        for (int i = 1; i < 4; i++) {
            
            if(number[i]<min){
                min = number[i];
            }            
        }
        
        System.out.println("Maximum number = "+max);
        System.out.println("Minimum number = "+min);
    }
}
