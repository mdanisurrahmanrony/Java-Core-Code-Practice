package StaticKeyword;

public class StaiticMethodTest {

    public static void main(String[] args) {
        
        StaticMethodDemo obj1 = new StaticMethodDemo();     //Creating object for static method is needed.
        obj1.display1();
        
        StaticMethodDemo.display2();       //Creating object for static method no need.

    }

}
