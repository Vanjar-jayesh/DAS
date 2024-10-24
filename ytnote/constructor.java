// //import javax.swing.SortingFocusTraversalPolicy;

// class Box{

//         double width;
//         double height;
//         double depth;


//         Box(double w, double h, double d){
//             width = w; 
//             height = h;
//             depth = d;
//         }
//       public  double volume(){
//             return width * height * depth;

//         }
//     }

// class cpo{
//     cpo(String name){
//         System.out.println("constructor with one " + "argument - string : " + name);

//     }
//     cpo(String name,int age){
//         System.out.println("constructor with two arguments :" + "string and integer :" +name+" "+age);
//     }
//     cpo(long id){
//         System.out.println("constructir with one argument :"+"Long : "+id);
//     }
// }



//  public class constructor {
//     public static void main(String[] args) {
//         // Box mybox1 = new Box(10, 20, 15);
//         // Box mybox2 = new Box(3, 6, 9);
//         // double vol;
//         // vol = mybox1.volume();
//         // System.err.println("volume is : "+vol);

//         // vol = mybox2.volume();
//         // System.out.println("volume is : " + vol);

//         cpo cpo1 = new cpo("jayesh");
//         cpo cpo2 = new cpo("vanjara",20);
//         cpo cpo3 = new cpo(057);



//     }
// }



// used constructor to generate random number
            // used setNum() to set number
            // used isCorrect() method to check
            // used Counter() to count number of guesses



            // import java.util.Scanner;

            // class Game{
            //     private int counter = 0;
            //     private int myNumber;
            //     private int compNumber;
            
            //     public Game(){
            //         compNumber = (int) (Math.random()*100);
            //     }
            //     public void setNumber(int n){
            //         myNumber = n;
            //     }
            //     public int isCorrect(){
            //         if(myNumber == compNumber){
            //             return 0;
            //         }
            //         else if(myNumber > compNumber){
            //             return -1;
            //         }
            //         else{
            //             return 1;
            //         }
            //     }
            //     public void setCounter(){
            //         counter++;
            //     }
            //     public void getCounter(){
            //         System.out.println("The number of guesses were "+ counter);
            //     }
            // }
            
            // public class constructor{
            //     public static void main(String[] args) {
            //         Game obj = new Game();
            //         Scanner sc = new Scanner(System.in);
                    
            
            //         while(true){
            //             System.out.println("Enter a number between 1 to 100 (1-100): ");
            //             int n = sc.nextInt();
            //             obj.setNumber(n);
            
            //             if(obj.isCorrect() == 0){
            //                 obj.setCounter();
            //                 System.out.println("Congratulations!! You have guessed the correct number");
            //                 obj.getCounter();
            //                 break;
            //             }
            //             else if(obj.isCorrect() == -1){
            //                 obj.setCounter();
            //                 System.out.println("Enter smaller number!!");
            //             }
            //             else if(obj.isCorrect() == 1){
            //                 obj.setCounter();
            //                 System.out.println("Enter larger number!!");
            //             }
            //         }
            //     }
            // }


            

import java.util.Random;
import java.util.Scanner;

class game {
    int random;
int n;
     void games() {

       Random rc = new Random();
           random = rc.nextInt(100);

    }

    void totakenumber() {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
    }



 }

    public class constructor {

        public static void main(String[] args) {

            game status = new game();
            System.out.println("SELECT THE NUMBER");
        status.totakenumber();
            System.out.println("SYSTEM IS CHOOSING THE NUMBER");

            status.games();
            System.out.println(status.random);


            if (status.n == status.random) {
                System.out.println("TRUE ! YOU WON");
            } else if (status.n > status.random )  {
                System.out.println("TRY AGAIN! YOU HAVE TO CHOOSE LESS NUMBER");

            } else {
                System.out.println("YOU HAVE TO CHOOSE HIGHER NUMBER");
            }

        }


        }