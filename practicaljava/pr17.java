package practicaljava;
 class mehtod_overloading{

    static int add(int a, int b){
        return a +b;
    }

    static int add(int a,int b,int c){
        return a + b+c;
    }

    
}

public class pr17 {
    public static void main(String[] args) {
        mehtod_overloading mo = new mehtod_overloading();

        int s = mo.add(11, 11);
        int s1 = mo.add(11, 11,11);

        System.out.println("mehtod_overloading:"+s + " "+s1);
        

    }
}
