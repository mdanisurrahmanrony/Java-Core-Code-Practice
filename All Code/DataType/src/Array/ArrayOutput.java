package Array;

public class ArrayOutput {
    
    public static void main(String[] args) {
        
        int[][] number = new int[4][5];
        
        int k = 0;
        
        
        //assigning the value of  the 2d array
        
        for (int row = 0; row < 4; row++) {
            
            for (int coloumn = 0; coloumn < 5; coloumn++) {
                
                number[row][coloumn] = k;
                k++;
                
            }
            
        }
        
        //printing the value of  the 2d array
        
        System.out.println("Inputted two dimensional array is : ");
        
        for (int row = 0; row < 4; row++) {
            
            for (int coloumn = 0; coloumn < 5; coloumn++) {
                
                System.out.print(number[row][coloumn]+"\t");                    
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
