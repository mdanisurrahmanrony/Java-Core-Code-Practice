package JavaCore1;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int sum = 0, r, temp, num;

        System.out.print("Enter any number : ");
        num = sn.nextInt();

        temp = num;

        while (temp != 0) {

            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }

        if (num == sum) {
            System.out.println(num + " is a palindrome number");
        } else {
            System.out.println(num + " is not a palindrome number");
        }
    }

}
