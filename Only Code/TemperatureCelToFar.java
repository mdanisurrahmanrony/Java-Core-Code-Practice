package JavaCore1;

import java.util.Scanner;

public class TemperatureCelToFar {
    
    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        
        double cels,farn;
        
        System.out.print("Enter value of  temperature in Celsius : ");
        cels = sn.nextDouble();
        
        farn = 1.8 * cels + 32;
        
        System.out.println("Fahrenheit : "+farn);
    }
}
