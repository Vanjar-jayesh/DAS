package practicaljava;

import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        int a ;
        double pi  =Math.PI;

        System.out.println("enter the number of area of circle:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        double area = pi * a *a;

        System.out.println("area of circle : "+area);
        
    

    }
}
