package javaim;

import java.util.Scanner;

public class pr4 {
    public static void main(String[] args) {
         int a ,b ,n;

        System.out.println("Enter the number1: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        
        System.out.println("Enter the number2: ");
        Scanner sc1 = new Scanner(System.in);
        b = sc1.nextInt();

          
        System.out.println("Enter the number3: ");
        Scanner sc2 = new Scanner(System.in);
        n = sc2.nextInt();

        if (a > b || a > n ) {
            System.out.println(" a is largest then b and n  :  "+a);
        }
        else if (b>n) {
            System.out.println("b  is largest then a and n :" +b);
            
        }
        else{
            System.out.println("n is largest then a and b  : "+ n);
        }

    }
}
