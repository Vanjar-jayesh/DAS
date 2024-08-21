package linked.likelist;

import javax.print.attribute.standard.Sides;

public class insertionlist {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        
        }   
    }
        public static class linkedlist01 {
            Node head = null;
            Node tail = null; 
            int size = 0;

             void insertATend(int val){
                Node temp = new Node(val);
                if (head==null) {
                    head = temp;
                    
                }
                else{
                    tail.next = temp;
                }
                tail =temp;
                 size++;
            }
            void display(){
                Node temp = head;
                while (temp != null) {
                    System.out.println(temp.data);
                    temp = temp.next;

                    }
                    System.out.println();
            }
        
            
        }

        public static void main(String[] args) {
            linkedlist01 ll = new linkedlist01();

            ll.insertATend(4);
            ll.insertATend(5);
            ll.insertATend(6);
            ll.insertATend(50);
            ll.display();

            System.out.println(ll.size);
            System.out.println(ll.head.data);
            System.out.println(ll.tail.data);

        }
}
