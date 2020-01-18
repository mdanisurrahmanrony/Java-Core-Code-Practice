package Array;

public class ArrayOutput2 {
    
    public static void main(String[] args) {
        
        int[][] number = new int[4][];      //protome shudhu row er size bole deoya holo, column er size bole deoya holo na
        int k = 0;
        
        number[0] = new int[1];     //Zero number row te column thakbe ekta
        number[1] = new int[2];     //Ek number row te column thakbe duita
        number[2] = new int[3];     //Dui number row te column thakbe tinta
        number[3] = new int[4];     //Tin number row te column thakbe charta
        
        for (int row = 0; row < 4; row++) {
            
            for (int column = 0; column < row+1; column++) {
                
                number[row][column] = k;
                k++;
                
            }
            
        }
        
        for (int row = 0; row < 4; row++) {
            
            for (int column = 0; column < row+1; column++) {
                
                System.out.print(number[row][column]+" ");
                
            }
            
            System.out.println();
            
        }
        
    }
    
}
