package RandomNumberGenerator;

import java.util.Random;


public class RandomDemo3 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(91) + 10;    //10 theke 100 porjonto jekono number generate korbe
        
        System.out.println("Random Number : "+randomNumber);
    }
    
}
