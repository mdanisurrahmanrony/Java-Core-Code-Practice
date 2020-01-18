package JavaCore3;

public class MethodOverridingPersonTeacherTest {

    public static void main(String[] args) {

        MethodOverridingTeacher t1 = new MethodOverridingTeacher();
        t1.name = "Rony";
        t1.age = 22;
        t1.qualification = "BSC in CSE";
        t1.displayInformation();

        MethodOverridingPerson p1 = new MethodOverridingPerson();
        p1.name = "Sanjida";
        p1.age = 22;
        p1.displayInformation();

    }

}
