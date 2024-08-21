package javaim;

import java.util.Scanner;

/**
 * pr2
 */
public class pr2 {

    public static void main(String[] args) {
        int n;
        int fact =1;
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        
        for (int i = 1; i <=n; i++) {
        //   System.out.println( fact  = i*i);
            fact = fact * i;
        }
  
     

        System.out.println(fact);
    }
}