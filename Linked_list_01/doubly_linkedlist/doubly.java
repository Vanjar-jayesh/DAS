


package Linked_list_01.doubly_linkedlist;

import Stack01.stack_in_array;
import array01.pusone;

public class doubly {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }

    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
    }
    // print the revs

    public static void display2(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;

        }
        System.out.println();
    }

    public static void display3(Node random) {
        Node temp = random;
        // move this temp backwards to the head;

        while (temp.prev != null) {
            temp = temp.prev;

        }
        // print the list:

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
        System.out.println();
    }

    public static Node insertATHead(Node head,int val){
            Node t =new Node(30);
            t.next = head;
            head.prev = t;
            head =t;
            return head;
    }

    public static void inserAttail(Node head,int val){
        Node temp = head;

        while (temp.next!=null) {
            temp = temp.next;

        }
        Node t = new Node(val);
        temp.next = t;
        t.prev = temp;
    }

    public static void inserAtidx(Node head,int idx,int val){
        Node s = head;
        for(int i=1; i<=idx-1; i++){
            s = s.next;
        }

        Node r  =s.next;
        Node t = new Node(val);

        s.next = t;
        t.prev = s;

        t.next = r;
        r.prev = t;

    }

    public static void deletehead(Node head){
        head = head.next;
        head.prev = null;
    }

    public static void deletetail(Node head){
        Node temp = head;

        while (temp.next!= null) {
            temp = temp.prev;
            temp.next = null;
        }
    }

    public static void deleteAtidx(Node head,int idx){
        Node temp = head;

        temp.next = temp.next.next;
        temp.next.prev = temp;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        e.next = null;

        display(a);
        // display2(e);
        // display3(b);
        // Node newHead = insertATHead(a, 35);
        // display(newHead);

        // inserAttail(a, 90);
        // display(a);

       // inserAtidx(a, 3, 56);
        // display(a);
        // 4 10 2 99 13 

     //   deleteAtidx(a, 3);
        deletetail(a);
        display(a);


    }
}
