package practicaljava;

import java.util.Stack;

public class pr33 {

    static void showpush(Stack<Integer> st, int a) {
        st.push(a);
        System.out.println("push(" + a + ")");
        System.out.println("stack:" + st);
    }

    static void showpop(Stack<Integer> st) {
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("stack:" + st);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println("stack: " + st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);

        showpop(st);
        showpop(st);
        showpop(st);

        try {
            showpop(st);
        } catch (Exception e) {
            System.out.println("Empty stack");
        }

    }
}
 
/*
 * OUTPUT:
 * stack: []
 * push(42)
 * stack:[42]
 * push(66)
 * stack:[42, 66]
 * push(99)
 * stack:[42, 66, 99]
 * pop -> 99
 * stack:[42, 66]
 * pop -> 66
 * stack:[42]
 * pop -> 42
 * stack:[]
 * pop -> Empty stack
 */