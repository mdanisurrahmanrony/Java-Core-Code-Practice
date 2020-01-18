package Polymorphism;


public class Triangle extends Shape{
    
    //area
    
    double base, height;

    public Triangle(double base, double height) {
        
        this.base = base;
        this.height = height;
        
    }
    
    double area(){
        
        System.out.print("Area for triangle : ");
        return 0.5 * base * height;
        
    }
    
        
}
