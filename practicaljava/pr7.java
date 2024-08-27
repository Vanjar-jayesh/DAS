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
