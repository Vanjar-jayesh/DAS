package practicaljava;

import java.util.Scanner;

public class pr3 {
 public static void main(String[] args) {
    int n1 ,n2;
    System.out.println("Enter number n1:");
    Scanner sc = new Scanner(System.in);
    n1 = sc.nextInt();

    System.out.println("Enter number n2:");
    Scanner sc1 = new Scanner(System.in);
    n2 = sc.nextInt();

    if (n1>n2) {
        System.out.println("n1 is lagest then n2:"+n1);

    }
    else{
        System.out.println("n2 is lagest then n1:"+n2);
    }

    }   
}
