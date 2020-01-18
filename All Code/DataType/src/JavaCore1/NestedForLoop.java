package JavaCore1;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int m, n;

        System.out.print("Enter Initial Number : ");
        m = sn.nextInt();

        System.out.print("Enter Initial Number : ");
        n = sn.nextInt();

        for (int i = m; i <= n; i++) {

            for (int j = 1; j <= 10; j++) {

                System.out.println(i+ " X " + j + " = " + i * j);

            }
            System.out.println("\n\n");

        }

    }

}
