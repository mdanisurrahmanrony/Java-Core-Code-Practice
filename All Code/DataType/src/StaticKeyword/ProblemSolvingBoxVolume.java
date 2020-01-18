package StaticKeyword;


public class ProblemSolvingBoxVolume {
    
    double height,width,depth;
    
    ProblemSolvingBoxVolume(double h,double w,double d){
        
        height = h;
        width = w;
        depth = d;
        
    }
    
    void displayVol(){
        
        double vol = height * width * depth;
        System.out.println("Volume is : "+vol);
    }
    
}
