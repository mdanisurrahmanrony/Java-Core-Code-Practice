package JavaCore1;

import java.util.Scanner;

public class TriangleArea {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        double base,height,area;
        
        System.out.print("Enter base : ");
        base = sn.nextDouble();
        
        System.out.print("Enter height : ");
        height = sn.nextDouble();
        
        area = 0.5 * base * height;
        
        System.out.println("Area of triangle : "+area);
    }
}
