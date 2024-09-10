// Write a Java Program that will display the Sum of 1+1/2+1/3…..+1/n.
package practicaljava;

import java.util.Scanner;

/**
 * pr7
 */
public class pr7 {

    public static void main(String[] args) {
        int n ;
        System.out.println("enter the number of terms:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        float sum = 0;

        for(int i=1; i<=n; i++){
            sum = sum + 1.0f/i;

        }
        System.out.println("the sum of the series is : "+sum);
    }
}
OUTPUT:
enter the number of terms:
5
the sum of the series is : 2.2833335
