package RandomNumberGenerator;

import java.util.Random;


public class RandomDemo {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        
        int randomNumber = rand.nextInt(10);    //0 theke 9 porjonto jekono number generate korbe
        
        System.out.println("Random Number : "+randomNumber);
    }
    
}
