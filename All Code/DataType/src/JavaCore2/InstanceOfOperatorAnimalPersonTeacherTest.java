package JavaCore2;

public class InstanceOfOperatorAnimalPersonTeacherTest {

    public static void main(String[] args) {

        InstanceOfOperatorAnimal a = new InstanceOfOperatorAnimal();
        InstanceOfOperatorPerson p = new InstanceOfOperatorPerson();
        InstanceOfOperatorTeacher t = new InstanceOfOperatorTeacher();
        
        System.out.println(a instanceof InstanceOfOperatorAnimal);
        System.out.println(p instanceof InstanceOfOperatorAnimal);
        System.out.println(t instanceof InstanceOfOperatorPerson);
        System.out.println(t instanceof InstanceOfOperatorAnimal);
        System.out.println(p instanceof InstanceOfOperatorTeacher);

    }

}
