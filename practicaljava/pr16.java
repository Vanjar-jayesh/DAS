package practicaljava;

/**
 * 
 */
 class  Nesting_method{

    public  static void mehtod1(int a , int b){
        System.out.println("a"+a);
        System.out.println(b);

        }

        
        public static void mehtod2(int x ,int y){

        int multi = x * y;
        System.out.println("x * y : "+multi);

          mehtod1(10,20);
        }

    }

    


public class pr16 {
    public static void main(String[] args) {
        Nesting_method  nm = new Nesting_method();

        nm.mehtod2(20, 10);
    }   
}
