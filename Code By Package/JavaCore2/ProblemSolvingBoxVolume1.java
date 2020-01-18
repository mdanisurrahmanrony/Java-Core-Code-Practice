//Hiding Instance Variable


package JavaCore2;

import StaticKeyword.*;


public class ProblemSolvingBoxVolume1 {
    
    double height,width,depth;
    
//    ProblemSolvingBoxVolume1(double height,double width,double depth){
//        
//        height = height;    //Instance variable hide hoye jasse karon ekhane local ebong instance variabke er name same ebong local variable er priority beshi.
//        width = width;    //Instance variable hide hoye jasse karon ekhane local ebong instance variabke er name same ebong local variable er priority beshi.
//        depth = depth;    //Instance variable hide hoye jasse karon ekhane local ebong instance variabke er name same ebong local variable er priority beshi.
//        
//    }
    
    
    ProblemSolvingBoxVolume1(double height,double width,double depth){
        
        this.height = height;   //this keyword ekhane instance variable hide (eki namer hoyay) solve hoye debe
        this.width = width;   //this keyword ekhane instance variable hide (eki namer hoyay) solve hoye debe
        this.depth = depth;   //this keyword ekhane instance variable hide (eki namer hoyay) solve hoye debe
        
    }
    
    void displayVol(){
        
        double vol = height * width * depth;
        System.out.println("Volume is : "+vol);
    }
    
}
