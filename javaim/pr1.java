package javaim;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        int r;
        System.out.println("enter the area of circle number : ");
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();

        double sum = Math.PI * r *r ;

        System.out.println("the area of a circle is a : "+sum);
    }
}
