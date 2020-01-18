package JavaCore4.toStringMethod;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }
    
    @Override
    public String toString(){       //toString() holo object class er ekta method . shob class er jonnoi object class hosse top most class.
        
        return "Name : "+name+"\nAge : "+age;
        
    }

}
