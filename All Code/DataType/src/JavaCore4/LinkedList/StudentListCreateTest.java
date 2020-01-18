package JavaCore4.LinkedList;

import java.util.LinkedList;


public class StudentListCreateTest {
    
    public static void main(String[] args) {
        
        //student linkedlist
        
        LinkedList<StudentListCreate> list = new LinkedList<StudentListCreate>();       //create LinkedList for StudentListCreate class
        
        //student create
        
        StudentListCreate s1 = new StudentListCreate(101,"Sanjida","BSC in CSE");
        StudentListCreate s2 = new StudentListCreate(102,"Lipi","Eleven");
        StudentListCreate s3 = new StudentListCreate(103,"Munni","Six");
        StudentListCreate s4 = new StudentListCreate(104,"Eni","Eight");
        
        //adding student to the studentList
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        //information display
        
        for(StudentListCreate s : list){
            
            System.out.println(s.id+" "+s.name+" "+s.className);
            
        }
        
    }
    
}
