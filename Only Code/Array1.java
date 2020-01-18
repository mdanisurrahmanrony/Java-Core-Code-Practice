package Array;

public class Array1 {
    
    public static void main(String[] args) {
        
//        int[] number;   //Array declaration
//        number = new int[5];   //Array creation. Here 5 is array size
        
          int[] number = new int[5];    //Array declaration and creation
          
          number[0] = 10;
          number[1] = 20;
          number[2] = 30;
          number[3] = 40;
          number[4] = 50;
          
          int len = number.length;    //Find array size or length
          
          int sum = number[0] + number[1] + number[2] + number[3] + number[4];
          
          System.out.println("Sum = "+sum);
          
          System.out.println("Array size = "+len);
          
          System.out.println("Value of array of index 3 = "+number[3]);
    }
}
