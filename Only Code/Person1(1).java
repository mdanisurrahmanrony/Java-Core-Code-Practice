package ThisKeyword;


public class Person1 {
    
    void message(){
        
        System.out.println("I am message method");
        
    }
    
    void display(){
        
        this.message();     //this keyword na dileo cholbe ekhane
        System.out.println("I am display method");
        
    }
    
}
