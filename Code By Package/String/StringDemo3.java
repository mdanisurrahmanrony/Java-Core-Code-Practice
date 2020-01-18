package String;

public class StringDemo3 {
    
    public static void main(String[] args) {
        
        String country = "   Bangladesh is my    country   ";     
        System.out.println(country);
        
        String s = country.trim();      //remove only all spaces in first and last sides (head/trail) of String. But not space of middle.
        System.out.println("After trim (removing first/last spaces) the String is : "+s);
        
        char ch = country.charAt(6);       //character at 6 index
        System.out.println("ch = "+ch);
        
        int value = country.codePointAt(0);     //index 0 er ascii value return korbe
        System.out.println("Value = "+value);
        
        int pos = country.indexOf("is");     //character/string er first index number return korbe. double quotation sign for string input, single quotation sign for character input
        System.out.println("first position of n = "+pos);
        
        pos = country.lastIndexOf('n');      //character/string er last index number return korbe. double quotation sign for string input, single quotation sign for character input
        System.out.println("last position of n = "+pos);
                
    }    
}
