package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size of arraylist is : " + number.size());

        //adding arralist
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);

        System.out.println("\nAfter adding elements arrayList is : ");
        
        for (int x : number) {
            
            System.out.print(x+" "); 
            
        }
        
        System.out.println("\nAfter adding elements the size of arraylist is : " + number.size());
        
        //removing elements
        
        number.remove(2);

        System.out.println("\nAfter removing elements by index arrayList is : ");
        
        for (int x : number) {
            
            System.out.print(x+" "); 
            
        }
        
        number.removeAll(number);

        System.out.print("\n\nAfter removing all elements arrayList is : ");
        
//        for (int x : number) {
//            
//            System.out.print(x+" "); 
//            
//        }
        
        System.out.println(number);
        
        
       System.out.println("\n");
    }

}
