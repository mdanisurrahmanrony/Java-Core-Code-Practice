package Abstraction;


public class Test {
    
    public static void main(String[] args) {
        
        MobileUser mu;     //super class er reference variable. abstract class er object toiri kora jay na kintu reference variable toiri kora zay.
        
        mu = new Rahim();       //super class er reference variable er dara sub class er object ke refer kora hosse
        mu.call();
        mu.sendMessage();
        
        mu = new Karim();       //super class er reference variable er dara sub class er object ke refer kora hosse
        mu.sendMessage();
        
    }
    
}
