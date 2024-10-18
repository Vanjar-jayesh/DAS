package practicaljava;


class A{
    public void Print_A(){
        System.out.println("class A");
    }
}

class B extends A{
    public void Ptint_B(){
        System.out.println("class B");
    }
}

class C extends A{
    public void Ptint_C(){
        System.out.println("class c");
    }
}

class D extends A{
    public void Ptint_D(){
        System.out.println("class D");
    }
}
public class pr23 {
    public static void main(String[] args) {
        B obj = new B();
        obj.Print_A();
        obj.Ptint_B();

        D obj1 = new D();

        obj1.Print_A();
        obj1.Ptint_D();
    }
}

/*
 *OUTPUT:
 *  class A
 * class B
 * class A
 * class D
 */