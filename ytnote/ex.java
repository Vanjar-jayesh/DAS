import java.util.Scanner;
import java.util.Random;

class Game{
    public int number;
    public int inpuntNumber;
    public int jay;

    public int getjay(){
        return jay;
    }
    public void setjay(int jay){
        this.jay = jay;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void userInput(){
        System.out.println("Guess the number:");
        Scanner sc = new Scanner(System.in);
        inpuntNumber = sc.nextInt();
    }

    boolean iscorrectnumber(){
        jay++;
        if (inpuntNumber==number) {
            return true;
        }
        else if (inpuntNumber<number) {
            System.out.println("Too low..");
            
        }
        else if(inpuntNumber>number){
            System.out.println("Too high..");

        }
        return false;
    }
}

public class ex {

    public static void main(String[] args) {
        Game g = new Game();
         boolean b = false;
         while(!b){
        g.userInput();
          b = g.iscorrectnumber();
         }

        // g.userInput();
        // int b = g.iscorrectnumber();
        // System.out.println(b);
    }
}

