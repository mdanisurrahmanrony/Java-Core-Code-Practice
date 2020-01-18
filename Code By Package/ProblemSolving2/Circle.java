package ProblemSolving2;


public class Circle extends Shape{
    
    //dim1, dim2
    //area of circle = 3.1416 * r * r
    
    public Circle (double r) {
        super(r,r);     //r er value save hobe super class Shape er dim1 ebong dim2 er modhdhe
    } 
    
    @Override
    void area(){
        
        double result = Math.PI * dim1 * dim2;
        System.out.println("Circle area : "+result);
        
    }
    
}
