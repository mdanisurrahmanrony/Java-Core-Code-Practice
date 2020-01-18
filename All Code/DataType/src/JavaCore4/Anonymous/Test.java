package JavaCore4.Anonymous;


public class Test {
    
    public static void main(String[] args) {
        
        Person p = new Person(){        //anonymous class create in runtime update
            
            @Override
            void display(){
                
                System.out.println("Test Class");
                
            }
            
        };
        
        p.display();
        
    }
    
}
