package JavaCore1;

import java.util.Scanner;

public class PrimeNumberSeriesPrint {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m, n, count = 0, totalPrime = 0;

        System.out.print("Enter initial number : ");
        m = sc.nextInt();

        System.out.print("Enter final number : ");
        n = sc.nextInt();

        System.out.println("Prime numbers from " + m + " to " + n + " are : ");

        for (int i = m; i < n; i++) {

            for (int j = 2; j <= i - 1; j++) {

                if (i % j == 0) {
                    count++;
                    break;
                }

            }

            if (count == 0) {
                System.out.println(i);
                totalPrime++;
            }
            count = 0;

        }
        
        System.out.println("Total prime number = "+totalPrime);

    }

}
