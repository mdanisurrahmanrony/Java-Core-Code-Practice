package StaticKeyword;

public class StaticBlockwithMainMethod {
    
    static int id;
    static String name;
    
    static{     //craeting static block for initializing static variable
        
        id =101;
        name = "Rony";
        
    }
    
    static void dislpay(){
        
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
        
    }
    
    public static void main(String[] args) {
        
        StaticBlockwithMainMethod.dislpay();

    }
    
}
