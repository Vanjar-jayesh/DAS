//write a java program to find the sum of the digits of given number
package practicaljava;

import java.util.Scanner;

public class pr6 {
    public static void main(String[] args) {
        int n1,n;
        int sum =0;

        System.out.println("enter number n1:");
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();

        while (n1>0) {
            n = n1%10;
            sum = sum +n;
            n1 = n1/10;
        }
        System.out.println("sum of number digist:"+sum);
    }
}


OUTPUT:
enter number n1:
25
sum of number digist:7
