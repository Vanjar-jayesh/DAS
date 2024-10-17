package practicaljava;
class box{
    double width , height,depth;

    box(double w, double h, double d){
        width = w;
        height =h;
        depth =d;

    }

    box(){
        width = height = depth =0;
    }

    box(double len){
        width = height =depth = len;
    }

    double volume(){
        return width * height *depth;
    }
}
public class pr20 {
    public static void main(String[] args) {
        
        box box1 = new box();
        box box2 = new box(7);
        box box3 = new box(10,20,15);

        double vol;

        vol = box3.volume();
        System.out.println("volume of box3 is :"+vol);

        vol = box2.volume();
        System.out.println("volume of cube is :"+vol);

        vol = box1.volume();
        System.out.println("volume of box2 is :"+vol);

    }
    
}

/*
 * OUTPUT:
 * volume of box3 is :3000.0
 * volume of cube is :343.0
 *  volume of box2 is :0.0
 * 
 * 
 * 
 */
