package JavaCore3;

public class MethodOverridingPersonTeacherTest1 {

    public static void main(String[] args) {

        MethodOverridingTeacher1 t1 = new MethodOverridingTeacher1();
        t1.name = "Rony";
        t1.age = 22;
        t1.qualification = "BSC in CSE";
        t1.displayInformation();

        MethodOverridingPerson1 p1 = new MethodOverridingPerson1();
        p1.name = "Sanjida";
        p1.age = 22;
        p1.displayInformation();

    }

}
