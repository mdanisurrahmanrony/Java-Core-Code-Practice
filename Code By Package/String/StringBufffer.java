package String;

public class StringBufffer {
    
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Anisur Rahman");      //Flexible String. Can be changed any time very easily with some methods without using any extra objects of String
        
        System.out.println(sb);
        
        sb.append(" Rony ");
        sb.append(25);
        
        System.out.println(sb);        
        
//        sb.reverse();
//        System.out.println(sb);
        
        sb.delete(0, 5);    //starting and ending point for delete
        System.out.println(sb);     //0 theke 5 index porjonto (character A theke u porjonto) shob character delete kora holo
        
        sb.setLength(5);
        System.out.println(sb);        //5 porjonto shob kisu print korbe
        
    }
    
}
