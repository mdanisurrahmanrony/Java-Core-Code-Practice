package RandomNumberGenerator;

import java.util.Random;


public class RandomDemo4 {
    
    public static void main(String[] args) {
        
        int randomNumber = (int) (Math.random()*10);        //0 theke 9
        //int randomNumber = (int) (Math.random()*10) + 1;        //1 theke 10
        //int randomNumber = (int) (Math.random()*100) + 1;        //1 theke 100
        
        System.out.println("Random Number : "+randomNumber);
    }
    
}
