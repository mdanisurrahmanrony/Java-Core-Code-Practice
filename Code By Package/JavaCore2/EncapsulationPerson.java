package JavaCore2;


public class EncapsulationPerson {
    
//    String name;
//    int age;
//    
//    void display(){
//        System.out.println("Name : "+name);
//        System.out.println("Age : "+age);
//    }
//    
    
    private String name;
    private int age;
    
    public void setName(String name){
        
        this.name = name;
        
    }
    
    public  String getName(){
        
        return name;
        
    }
    
    public void setAge(int age){
        
        this.age = age;
        
    }
    
    public  int getAge(){
        
        return age;
        
    }
    
}
