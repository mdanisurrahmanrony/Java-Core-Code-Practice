package JavaCore1;

import java.util.Scanner;

public class CircleArea {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        double radius,area;
        
        System.out.print("Enter radius : ");
        radius = sn.nextDouble();
        
        area = 3.1416 * radius * radius;
        
        System.out.println("Area of circle : "+area);
    }
}
