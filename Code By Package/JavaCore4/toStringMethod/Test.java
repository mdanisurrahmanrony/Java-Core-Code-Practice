package JavaCore4.toStringMethod;


public class Test {
    
    public static void main(String[] args) {
        
        Person p1 = new Person("Rony",22);
        Person p2 = new Person("Sanjida",22);
        
        System.out.println(p1);     //toString() . object ta automatically call debe toString() method ke (jeta ekhon person class e ache)
        System.out.println(p2);     //toString() . object ta automatically call debe toString() method ke (jeta ekhon person class e ache)
        
    }
    
}
