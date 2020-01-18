package ArrayList;

import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo3 {

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

            System.out.print(x + " ");

        }
        
        boolean check = number.isEmpty();
        
        System.out.println("\n\nArraylist empty : "+check);
        
        boolean contain = number.contains(30);
        
        System.out.println("\n30 is in the list : "+contain);
        
        int position = number.indexOf(40);
        
        System.out.println("\nThe index of 40 is : "+position);
        
        number.set(3, 50);  //used only for replace
        
        System.out.println("\nAfter setting/replacing at index 3 the arraylist is : "+number);
        
        int x = number.get(0);
        
        System.out.println("\nNumber at zero index is : "+x);

        number.clear();

        System.out.println("\nAfter clearing elements arrayList contains : " + number);

        check = number.isEmpty();
        
        System.out.println("\nArraylist empty : "+check);
        
        System.out.println("\n");
    }

}
