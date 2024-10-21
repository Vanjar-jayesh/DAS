package practicaljava;
class mythread extends Thread{
    public void run(){
    
        int a = 10;
        int b = 20;
        int ans;

        ans = a*b;
        System.out.println("A*B: "+ans);
        
    }
}
public class pr36 {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        t1.start();
    }
    
}

/*
 * OUTPUT:
 * A*B: 200
 */