package practicaljava;

import java.util.Enumeration;
import java.util.Vector;

public class pr32 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("First element:" + v.firstElement());
        System.out.println("Last element:" + v.lastElement());

        Enumeration<Integer> vEnum = v.elements();

        System.out.println("Elements in vectoe:");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");

        }
        System.out.println();

    }
}

/*
 * OUTPUT:
 * First element:1
 * Last element:4
 * Elements in vectoe:
 * 1 2 3 4
 */