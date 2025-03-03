

package Linked_list_01;

public class displaying_a_linkedlist02 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtend(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;

            }
            System.out.println();
        }

        // int size() {
        //     Node temp = head;
        //     int count = 0;
        //     while (temp != null) {
        //         count++;
        //         temp = temp.next;

        //     }
        //     return count;
        // }

        void insertATHead(int val) {
            Node temp = new Node(val);

            if (temp == null) {
                insertAtend(val);
            } else {
                temp.next = head;
                head = temp;
            }
            size++;

        }

        void insertAtindx(int idx,int val){
            Node t = new Node(val);
            Node temp = head;

            if (idx == size) {
                insertAtend(val);
                return;
            }
            else if (idx ==0) {
                insertATHead(val);
                return;
            }
            else if (idx<0||idx>size) {
                System.out.println("wrong index");
                return;
            }

            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next =t;
            size++;

        }

        int getAt(int idx){
             if (idx<0||idx>size) {
                System.out.println("wrong index");
                return-1;
            }
            Node temp = head;

            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void inserAtlast(int val){
            Node temp = new Node(val);
            Node t = head;
            while (t.next!=null) {
                t =t.next;
            }
            t.next = temp;
            size++;
        }

        void deletefirst(int idx){
            if (idx==0) {
                head = head.next;
                size--;
            }
        }
        void daleteAT(int idx){
            // if (idx==0) {
            //     head = head.next;
            //     size--;
            //     return;
            // }
            Node temp = head;

            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            tail = temp;
            size--;
        }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtend(5);
        ll.insertAtend(2);
        ll.insertAtend(4);
        ll.display();
     
        ll.insertATHead(10);
        ll.display();
     //   System.out.println(ll.size);

        ll.insertAtindx(4, 11);
        ll.insertAtindx(0, 1);

        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.getAt(4));

      //  ll.inserAtlast(100);
        ll.display();

        ll.deletefirst(0);
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.head.data);
        // System.out.println();
        // System.out.println();

        // ll.deletefirst(0);
        // ll.display();
        // System.out.println(ll.tail.data);
        // System.out.println(ll.size);

    }
}
