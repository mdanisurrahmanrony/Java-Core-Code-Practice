package JavaCore1;

import java.util.Scanner;

public class Pattern1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter line/row numbers : ");
        int n = sc.nextInt();
        
        for (int row = 1; row <= n; row++) {
            
            for (int column = 1; column <= row; column++) {
                System.out.print(column+" ");
            }
            
            System.out.println();
            
        }
        
    }
    
}
