package JavaCore4;

import java.util.HashMap;


public class HashMapDemo {
    
    public static void main(String[] args) {
        
        //put, get
        
        HashMap <Integer,String> customer = new HashMap <Integer,String>();
        
        customer.put(101, "Rony");
        customer.put(102, "Shuvo");
        customer.put(103, "Moktar");
        
        System.out.println(customer.get(101));     //getting value by its key (101)
        System.out.println(customer.get(102));     //getting value by its key (102)
        System.out.println(customer.get(103));     //getting value by its key (103)
        
    }
    
}
