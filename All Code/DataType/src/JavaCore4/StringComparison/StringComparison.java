package JavaCore4.StringComparison;


public class StringComparison {
    
    public static void main(String[] args) {
        
        String password1 = "Rony";
        String password2 = "Rony";
        String password3 = new String("Rony");
        String password4 = new String("Rony");
        
        System.out.println(password1==password2);     //check reference
        System.out.println(password1==password3);     //check reference
        System.out.println(password3==password4);     //check reference
                
    }
    
}
