package Array;

import java.util.Scanner;

public class ForEachLoop2 {

    public static void main(String[] args) {
        
        
        int[] num = {10,20,30,40,50,60,70,80,90,100};
        int sum = 0;

        for (int x: num) {      //foreach loop

            System.out.println(x);
            
            sum = sum + x;
        }
        
        System.out.println("\nSum = "+sum);

    }

}
