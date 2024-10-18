package practicaljava;
class over{
    int x; 
    public int method1(){
        return x;
    }

    public void overri(){
        System.out.println("methods is overriding");
    }
}

class overriding extends over{
    @Override
    public void overri(){
        super.overri();
        System.out.println("methids is overriding and two");
    }
    
}
public class pr24 {
    public static void main(String[] args) {
        overriding j = new overriding();
        j.x =10;
        j.overri();
        System.out.println(j.method1());
    }
}

/*
 * OUTPUT:
 * methods is overriding
 * methids is overriding and two
 * 10
 * 
 */