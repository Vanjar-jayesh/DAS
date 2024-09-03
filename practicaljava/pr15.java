package practicaljava;

import linked.likelist.lin01;

public class pr15 {
    static int a =3;
    static int b ;
    static void math(int x){
        System.out.println("x :"+x);
        System.out.println("a:"+a);
        System.out.println("b :"+b);
    }
    static{
        System.out.println("static block initalized:");
        b = a * b;
    }
    public static void main(String[] args) {
        
        math(42);
    }
}
