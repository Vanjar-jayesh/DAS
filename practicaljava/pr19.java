package practicaljava;

class parameterized_construcors{

    parameterized_construcors(int x , int y){

        System.out.println("this is a parameterized_construcors:"+x+" "+y);
    }
}
public class pr19 {

    public static void main(String[] args) {
        parameterized_construcors ps = new parameterized_construcors(12, 20);

    }
}

/*
 * 
 * OUTPUT:
 * this is a parameterized_construcors:12 20
 */