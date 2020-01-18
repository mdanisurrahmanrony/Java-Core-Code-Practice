package Array;

import java.util.Arrays;

public class SortingArray {
    
    public static void main(String[] args) {
        
        int[] number = {10,-3,18,5,25};
        
        Arrays.sort(number);
        
        System.out.println("Sorting array in ascending array order : ");
        
        for (int i = 0; i < number.length; i++) {
            
            System.out.print(number[i]+" ");
            
        }
        
        System.out.println("\n\nSorting array in descending array order : ");
        
        for (int i = number.length-1; i >= 0; i--) {
            
            System.out.print(number[i]+" ");
            
        }
        System.out.println("\n");
        
    }
    
}
