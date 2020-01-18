package String;

public class StringDemo4 {
    
    public static void main(String[] args) {
        
        String s1 = " This is my country";
        System.out.println(s1);
        
        String s3 = "This_is_my country";
        System.out.println(s3);
        
        String s6 = "01710-441850";
        System.out.println(s6);
        
        String s2 = s1.replace('i', 'j');
        System.out.println(s2);
        
        String[]  s4 = s1.split(" ");
        for(String x:s4){
            System.out.println(x);
        }
        
        System.out.println();
        
        String[]  s5 = s3.split("_");
        for(String x:s5){
            System.out.println(x);
        }
        
        System.out.println();
        
        String[]  s7 = s6.split("-");
        for(String x:s7){
            System.out.println(x);
        }
                        
    }    
}
