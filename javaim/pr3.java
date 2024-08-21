package javaim;

import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        int a ,b ;

        System.out.println("Enter the number1: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        
        System.out.println("Enter the number2: ");
        Scanner sc1 = new Scanner(System.in);
        b = sc1.nextInt();

        if (a > b ) {
            System.out.println(" a is largest then b :  "+a);
        }
        else{
            System.out.println("b is largest then a : "+ b);
        }


    }


}
