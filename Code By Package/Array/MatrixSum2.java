package Array;

import java.util.Scanner;

public class MatrixSum2 {
    
    public static void main(String[] args) {
        
        int[][] mat1 = new int[2][3];
        int[][] mat2 = new int[2][3];
        int[][] sum = new int[2][3];
        
        Scanner sc = new Scanner(System.in);
        
        //getting input for a matrix
        
        System.out.print("Enter the value of first matrix : ");
        
        for (int row = 0; row < 2; row++) {
            
            for (int column = 0; column < 3; column++) {
                
                System.out.printf("Matrix1[%d][%d] = ",row,column);
                mat1[row][column] = sc.nextInt();
                
            }
            
        }
        
        
        //printing input for a matrix
        
        System.out.println("\nFirst matrix is : ");
        
        for (int row = 0; row < 2; row++) {
            
            for (int column = 0; column < 3; column++) {
                
                System.out.print(mat1[row][column]+"\t");
                
            }
            
            System.out.println();
            
        }
        
        //getting input for matrix one
        
        System.out.print("\n\nEnter the value of second matrix : ");
        
        for (int row = 0; row < 2; row++) {
            
            for (int column = 0; column < 3; column++) {
                
                System.out.printf("Matrix2[%d][%d] = ",row,column);
                mat2[row][column] = sc.nextInt();
                
            }
            
        }
        
        
        //printing input for a matrix two
        
        System.out.println("\nSecond matrix is : ");
        
        for (int row = 0; row < 2; row++) {
            
            for (int column = 0; column < 3; column++) {
                
                System.out.print(mat2[row][column]+"\t");
                
            }
            
            System.out.println();
            
        }
        
        //Adding first and second matrix
        
        System.out.println("\nSummation of two matrix is : ");
        
        for (int row = 0; row < 2; row++) {
            
            for (int column = 0; column < 3; column++) {
                
                sum[row][column] = mat1[row][column] + mat2[row][column];
                
                System.out.print(sum[row][column]+"\t");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
