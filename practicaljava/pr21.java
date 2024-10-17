package practicaljava;


class one{
    public void print_single(){
        System.out.println("single  inheritance: ");
    }
}

class two extends one{
    public void Print_for(){
        System.out.println("for");
    }
}
public class pr21 {
    public static void main(String[] args) {
        two si = new two();

        si.print_single();
    }
    
}

/*
 * OUTPUT:
 * single  inheritance:
 */