package practicaljava;

import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {

        int day;

        System.out.println("enter day:");
        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();

        // write a java program that shows the digits statement
        switch (day) {
            case 1:
                System.out.println("mon..");
                break;
                
            case 2:
            System.out.println("tue..");
            break;
            
            case 3:
                System.out.println("wed..");
                break;
                
            case 4:
            System.out.println("thu..");
            break;
            
            case 5:
                System.out.println("fri..");
                break;
                
            case 6:
            System.out.println("sat..");
            break;
        
            case 7:
                System.out.println("sun..");
                break;
            default:
            System.out.println("Invlied day");
                break;
        }
    }
}
