package JavaCore4.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("Afganistan");
        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add(5, "Brazil");     //add countryNames with  its index using double parameter
        countryNames.addFirst("Australia");
        countryNames.addLast("Japan");

        System.out.println("Before removing countries are : ");
        for (String country : countryNames) {

            System.out.println(country);

        }

        System.out.println("\nSize of the linkedlist : " + countryNames.size());

//        countryNames.remove("Nepal");     
        countryNames.remove(5);
        System.out.println("\nAfter removing Nepal countries are : ");
        for (String country : countryNames) {

            System.out.println(country);

        }
        
        countryNames.removeFirst();
        countryNames.removeLast();
        
        System.out.println("\nAfter removing first & last countries are : ");
        for (String country : countryNames) {

            System.out.println(country);

        }

    }

}
