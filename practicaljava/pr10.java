package practicaljava;

import java.util.Scanner;

public class pr10 {
    public static void main(String[] args) {
        int n ,x;

        System.out.println("enter the number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        
        System.out.println("enter the number:");
        Scanner sc2 = new Scanner(System.in);
        x= sc2.nextInt();


        int sum = n + x;

        for(int i = 1; i<=n+x; i++){

            if (sum != i) {
                continue;
                // this is use of the continue Statemant:
                
            }
            else{
                System.out.println("not the sema of the value is  n and x");
            }
        }


    }
}
