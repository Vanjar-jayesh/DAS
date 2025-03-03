

package Linked_list_01;

import Stack01.stack_in_array;

public class linkedlist01 {

    public static class Node{
        int date;
        Node next;
        Node(int date){
            this.date = date;
        }

    
        
    }
    // find the length
    public static int  length(Node head){
        int count =0;

        while (head !=null) {
            count++;
            head = head.next;
            
        }
        return count;

    }
    // display the rcaversling
    public static void displayrecv(Node head){
            if (head==null) {
                return;
            }
            displayrecv(head.next);
            System.out.print(head.date+" ");
          


    }
    // display the linkedlist 
    public static void display(Node head){

        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.date+" ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        Node ls = new Node(4);
        Node ls1 = new Node(3);
        Node ls2= new Node(9);
        Node ls3 = new Node(8);
        Node ls4= new Node(16);

        ls.next =ls1;
        ls1.next = ls2;
        ls2.next = ls3;
        ls3.next = ls4;
        // Node temp = ls;
        // System.out.println(ls.next.next.date);
        // for(int i=1; i<=5; i++){
        //     System.out.print(temp.date+" ");
        //     temp = temp.next;
        // }

        // while (temp!=null) {
        //     System.out.print(temp.date+" ");
        //     temp = temp.next; 
        // }
       
       display(ls);
       System.out.println();
        displayrecv(ls);
        System.out.println();

        System.out.println(length(ls));

    }
}
