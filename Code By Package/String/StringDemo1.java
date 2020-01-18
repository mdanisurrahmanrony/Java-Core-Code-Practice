package String;

public class StringDemo1 {
    
    public static void main(String[] args) {
        
        String s1 = "Md. Anisur Rahman Rony";
        String s2 = new String ("Md. anisur Rahman Rony");
        String s4 = new String ();
        
        char[] s3 = {'R','o','n','y'};      //string is a character type array
        
        System.out.println("String1 = "+s1);       
        System.out.println("String2 = "+s2);  
        System.out.print("String3 = ");
        System.out.println(s3);   
        
        int len = s1.length();      //calculating length of string
        System.out.println("Length of String1 = "+len);

        if(s1 == s2){       //doesn't compare values
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        
        if(s1.equals(s2)){       //compares values & case sensitive
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        
        if(s1.equalsIgnoreCase(s2)){       //compares values & not case sensitive
            System.out.println("Equals");
        }
        else{
            System.out.println("Not equals");
        }
        
        if(s1.contains("Rony")){       //s1 er modhdhe Rony ase kina ta check korbe
            System.out.println("Contains");
        }
        else{
            System.out.println("Does not contain");
        }
        
        boolean con = s1.contains("oni");
        System.out.println(con);
        
        con = s1.contains("ony");
        System.out.println(con);
        
        boolean b = s1.isEmpty();
        System.out.println("b = "+b);
        
        b = s4.isEmpty();
        System.out.println("b = "+b);
        
    }
    
}
