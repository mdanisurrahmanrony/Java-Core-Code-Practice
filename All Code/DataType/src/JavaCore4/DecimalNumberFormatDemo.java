package JavaCore4;

import java.text.DecimalFormat;

public class DecimalNumberFormatDemo {

    public static void main(String[] args) {
        
        
        //        double x = 2.9875488;
        //        System.out.printf("x = %.2f",x);    //printf hobe. + er poriborte koma hobe
        //        System.out.println("\n");

        DecimalFormat obj = new DecimalFormat("0.000");     //"0.00" means doshomiker pore koy ghor dekhabe ta bole deoya hoese
        double x = 2.9875488;
        System.out.println("x  = "+obj.format(x));
        
    }

}
