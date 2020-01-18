package JavaCore4.StringComparison;


public class StringComparison1 {
    
    public static void main(String[] args) {
        
        String password1 = "Rony";
        String password2 = "Rony";
        String password3 = new String("Rony");
        String password4 = new String("Rony");
        String password5 = new String("Rony123");
        
        System.out.println(password1.equals(password2));     //check contents
        System.out.println(password1.equals(password3));     //check contents
        System.out.println(password3.equals(password4));     //check contents
        System.out.println(password3.equals(password5));     //check contents . ekhetre false hobe karon eder contents/value same na
                        
    }
    
}
