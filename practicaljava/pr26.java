package practicaljava;

abstract class jay {

    public void method() {
        String Fname = "Don";
        int age = 24;
        System.out.println("name:" + Fname);
        System.out.println("Age: " + age);

    }

    public abstract void study();
}

class student extends jay {
    public void study() {
        System.out.println("studying all day long");
    }
}

class pr26 {
    public static void main(String[] args) {

        student obj = new student();

        obj.study();
        obj.method();
    }
}

/*
 * OUTPUT:
 * studying all day long
 * name:Don
 * Age: 24
 */
