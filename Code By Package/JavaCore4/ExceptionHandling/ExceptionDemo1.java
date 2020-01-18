package JavaCore4.ExceptionHandling;

public class ExceptionDemo1 {

    public static void main(String[] args) {

        try {

            int[] a = new int[4];
            a[4] = 10;

        }catch(ArithmeticException e1){
            
            System.out.println("Exception : "+e1);
            
        }
        catch(Exception e2){
            
            System.out.println("Exception : "+e2);
            
        }
        
        finally{
            
            System.out.println("Last line of the program");
            
        }
        
    }

}
