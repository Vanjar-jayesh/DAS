package practicaljava;

import java.util.Scanner;

import array01.pusone;

/**
 *  
 */
 class   Student{

        public  void Student1(int marsk1,int marsk2, int marsk3,int marsk4, int marsk5){

            int sub1 = marsk1;
            int sub2 = marsk2;
            int sub3 = marsk3;
            int sub4 = marsk4;
            int sub5 = marsk5;

            int total = sub1 + sub2 +sub3 + sub4 +sub5;

            System.out.println("total marsk of student:"+total);

            double pr = total/5.0;

            System.out.println("per:"+pr);

            // create a garade codeing



        }
    
}

public class pr13 {
    public static void main(String[] args) {

        int marsk1,marsk2,marsk3,marsk4,marsk5;

        //for(int i =0; i<=5; i++){
            System.out.println("enter the marsk:");
            Scanner sc = new Scanner(System.in);
            marsk1 = sc.nextInt();
            marsk2 = sc.nextInt();
            marsk3 = sc.nextInt();
            marsk4 = sc.nextInt();
            marsk5  = sc.nextInt(); 

     //   }

        Student st = new Student();

    
        // for(int j= 0; j<=5; j++){
            st.Student1(marsk1,marsk2,marsk3,marsk4,marsk5);
        // }

        
    }
}
