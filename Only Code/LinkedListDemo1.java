package JavaCore4.LinkedList;

import java.util.LinkedList;


public class LinkedListDemo1 {
    
    public static void main(String[] args) {
        
        LinkedList<String> countryNames = new LinkedList<String>();
        
        countryNames.add("Afganistan");
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        
        for(String country : countryNames){
            
            System.out.println(country);
            
        }
        
    }
    
}
