package RandomNumberGenerator;

import java.util.Random;


public class RandomDemo2 {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(6) + 5;    //5 theke 10 porjonto jekono number generate korbe
        
        System.out.println("Random Number : "+randomNumber);
    }
    
}
