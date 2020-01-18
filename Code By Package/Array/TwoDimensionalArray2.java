package Array;

public class TwoDimensionalArray2 {
    
    public static void main(String[] args) {
        
        int[][] number = new int[2][3];
        
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;
        
        for (int row = 0; row < 2; row++) {
            
            for (int column = 0; column < 3; column++) {
                
                System.out.print(number[row][column]+" ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
