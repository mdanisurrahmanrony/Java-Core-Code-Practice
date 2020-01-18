package JavaCore2;


public class InheritingPrivateMemberPersonTeacherTest {
    
    public static void main(String[] args) {
        
        InheritingPrivateMemberTeacher obj1  = new InheritingPrivateMemberTeacher();
        obj1.setName("Rony");
        obj1.setAge(22);
        obj1.setQualification("BSC in CSE");
        obj1.displayInformation();
        
        InheritingPrivateMemberTeacher obj2  = new InheritingPrivateMemberTeacher();
        obj2.setName("Israt Ara");
        obj2.setAge(25);
        obj2.setQualification("BSC in CSE");
        obj2.displayInformation();
        
    }
    
}
