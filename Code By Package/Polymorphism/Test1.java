package Polymorphism;

public class Test1 {

    public static void main(String[] args) {

//        Shape s = new Shape();
//        Rectangle r = new Rectangle(10,20);
//        Triangle t = new Triangle(10, 20);
//        
//        System.out.println(s.area());
//        System.out.println(r.area());
//        System.out.println(t.area());
//        Shape s1 = new Shape();
//        Shape s2 = new Rectangle(10,20);
//        Shape s3 = new Triangle(10, 20);
//        
//        System.out.println(s1.area());
//        System.out.println(s2.area());
//        System.out.println(s3.area());
//        Shape[] s = new Shape[3];
//        s[0] = new Shape();
//        s[1] = new Rectangle(10, 20);
//        s[2] = new Triangle(10, 20);
//
//        System.out.println(s[0].area());
//        System.out.println(s[1].area());
//        System.out.println(s[2].area());
        

        Shape[] s = new Shape[3];
        s[0] = new Shape();
        s[1] = new Rectangle(10, 20);
        s[2] = new Triangle(10, 20);
        
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println(s[i].area());
            
        }
        
    }

}
