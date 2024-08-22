//write a java program that will find the largest no from the give three nos
package practicaljava;

import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
            int n1 ,n2,n3;
    System.out.println("Enter number n1:");
    Scanner sc = new Scanner(System.in);
    n1 = sc.nextInt();

    System.out.println("Enter number n2:");
    Scanner sc1 = new Scanner(System.in);
    n2 = sc.nextInt();

    System.out.println("enter number n3:");
    Scanner sc2 = new Scanner(System.in);
    n3 = sc2.nextInt();

    if (n1>n2|| n1>n3) {
        System.out.println("n1 is largest than n2 and n3"+n1);
    }
        // n2 is largest than n1 and n3
    else if (n2>n1 || n2>n3) {
        System.out.println("n2 is largest than n1 and n3 :"+n2);
        
    }
    else if (n3>n1 || n3 > n2) {
        
    }{
        System.out.println("n3 is sammaer than n1 and n2"+n3);
    }

    }
}
