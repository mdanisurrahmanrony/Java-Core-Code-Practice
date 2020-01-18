package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("Size of arraylist is : " + number.size());

        //adding arralist
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);

        //System.out.println(number);     //printing arraylist (method one)
        System.out.println("\nAfter adding elements the size of arraylist is : " + number.size());

        System.out.println("\nArrayList is : ");
        
        for (int x : number) {     //printing arraylist using for each loop (method two)
            
            System.out.print(x+" "); 
            
        }
        
        System.out.println("\n\nArrayList is : ");
        
        Iterator itr = number.iterator();
        
        while(itr.hasNext()) {     //printing arraylist using one method of iterator class (method three)
            
            System.out.print(itr.next()+" "); 
            
        }
        
       System.out.println("\n");
    }

}
