package JavaCore1;

import java.util.Scanner;

public class ArmStrongNumber {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int sum = 0, r, temp, num;

        System.out.print("Enter any number : ");
        num = sn.nextInt();

        temp = num;

        while (temp != 0) {

            r = temp % 10;
            sum = sum + r * r * r;
            temp = temp / 10;

        }

        if (num==sum) {
            System.out.println(num+" is an armstrong number");     // Example: 153 is an armstrong number because (1^3)+(5^3)+(3^3)=153. That means if the sum of cube of all digits are equal to the number then it is an arstrong number.
        }
        else{
            System.out.println(num+" is not an armstrong number");
        }
    }

}
