/**
 * objectmethod
 */
class Employee {

    int salary;
    String name;

    public int getsalary(){
        return salary;
    }

    public String getname(){
        return name;
    }

    public void setname(String n){
        name = n;
    }
}   

/**
 * Innerobjectmethod
 */
 class cellphone {

    
    public void ring(){
        System.out.println("ringing of uaser");

    }
    
    public void vibvating(){
        System.out.println("vibvating of uaser phone ");

    }

    public void callfinder(){
        System.out.println("call the for uaser phone");
    }
    
}

/**
 * Innerobjectmethod
 */
class square{

    int side;
    public int area(){
        return side*side;

    }
    public int perimeter(){
        return 4*side;
    }
    
}

class rectangle{

    int w ,l;

    public int rect(){
        return w *l;
    }

    public int parimeter(){
        return 2*(l+w);
    }

}

/**
 * Innerobjectmethod
 */
class Tommyvecetti {

    public  void hiit(){
        System.out.println("hitting the of gamer of payle");
    }

    public void runn(){
        System.out.println("running of the payler");
    }

    public void fering(){
        System.out.println("fering of the payler in the eniam");
    }
}

class circle{

    double pi=3.141,area;
    int r = 4;
    public void cre(){
       // int a;
        area =  pi * r *r;
        //return area;
        System.out.println( "area of circle\t"+area);
    }
}

// class default{
// 	public void cont(){
        
//         System.out.println("default constructors");
    
//     }
// }



public class objectmethod {
    public static void main(String[] args) {

        //problem number 1 
        // Employee jayesh = new Employee();

        // jayesh.setname("codewithjayesh");
        // System.out.println(jayesh.getname());

        // jayesh.salary = 255;

        // System.out.println(jayesh.getsalary());


        // problem number 2 

      /*  cellphone vivo21 = new cellphone();

        vivo21.callfinder();
        vivo21.ring();
        vivo21.vibvating();
         
        */

        // problem number 3 
     
        square sq  = new square();

        sq.side =5;

        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        
         // problem number 4

        //  rectangle recta = new rectangle();

        //  recta.l =8;
        //  recta.w=3;

        //  System.out.println(recta.rect());
        // System.out.println(recta.parimeter());


         // problem number 5

        //  Tommyvecetti game = new Tommyvecetti();

        //  game.runn();
        //  game.hiit();
        //  game.fering();

        //problem number 6

      //  circle cr = new circle();
      //  cr.pi=3.14;
        //cr.r=4;
     //  cr.cre();
       // System.out.println(cr.cre());

    //   default obj = new default();




    }
}