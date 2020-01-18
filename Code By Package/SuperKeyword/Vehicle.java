package SuperKeyword;


public class Vehicle {
    
    String color;
    double weight;
    
    Vehicle(String c, Double w){
        
        color = c;
        weight = w;
        
    }
    
    void attribute(){
        
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
        
    }
    
}
