package JavaCore2;


public class VariableLengthArguementsTest {
    
    public static void main(String[] args) {
        
        VariableLengthArguements obj = new VariableLengthArguements();
//        obj.add(10, 20);
//        obj.add(10, 20, 30);
//        obj.add(10, 20, 30,  40);


        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10, 20, 30, 40);
        obj.add(10, 20, 30, 40, 50);
    }
    
}
