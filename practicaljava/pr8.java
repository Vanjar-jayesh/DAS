package practicaljava;

import java.util.Scanner;

import Stack01.basic01;

public class pr8 {
    public static void main(String[] args) {
      
        int n;
        System.out.println("enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        boolean isprime = true;

        for (int i = 2; i <=n/2; i++) {
            
            if (n%i==0) {
                isprime = false;
                break;
                
            }
        }
        if (isprime) {
            System.out.println(n+"is a prime number");
        }
        else{
            System.out.println("not the prime number "+n);
        }
    }
    
}

OUTPUT:
enter the number : 
7
7is a prime number
