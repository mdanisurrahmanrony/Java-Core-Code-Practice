package JavaCore2;


public class InheritancePersonTeacherTest {
    
    public static void main(String[] args) {
        
        InheritanceTeacher obj1 = new InheritanceTeacher();
        obj1.name = "Md. Anisur Rahman Rony";
        obj1.age = 22;
        obj1.qualification = "BSC in CSE";
        obj1.displayInformation2();
        
        InheritanceTeacher obj2 = new InheritanceTeacher();
        obj2.name = "Israt Ara";
        obj2.age = 35;
        obj2.qualification = "MSC in CSE";
        obj2.displayInformation2();
        
    }
    
}
