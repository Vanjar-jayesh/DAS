package javaim;

import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        
        int choice;

        do{
            System.out.println("enter your choice : ");
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("monday");
                    break;
            
                    case 2:
                    System.out.println("tue...");
                    break;
                    
                case 3:
                System.out.println("Wed...");
                break;
                
                case 4:
                    System.out.println("Thu...");
                    break;
                    
                case 5:
                System.out.println("fri...");
                break;
                
                case 6:
                    System.out.println("sat...");
                    break;
                    
                case 7:
                System.out.println("sun....");
                break;
                
                default:
                        System.out.println("inveled number : ");
                    break;
            }
        }while(choice == 0);
    }
}
