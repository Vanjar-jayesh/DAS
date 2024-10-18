package practicaljava;

interface A {
    void methodA();
}

interface B extends A {
    void methodB();
}

interface C extends B {
    void methodC();
}

class MyClass implements C {
    @Override
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B from interface B");
    }

    @Override
    public void methodC() {
        System.out.println("Method C from interface C");
    }
}

public class pr28 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}

/*
 * OUTPUT:
 * Method A from interface A
 * Method B from interface B
 * Method C from interface C
 */